package p.p.configuration;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.expression.SecurityExpressionHandler;
import org.springframework.security.access.hierarchicalroles.RoleHierarchy;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.access.expression.DefaultWebSecurityExpressionHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	private BCryptPasswordEncoder bCryptPasswordEncoder;
    private AccessDeniedHandler accessDeniedHandler;
    private RoleHierarchy roleHierarchy;
    
    @Autowired
	DataSource dataSource;
	
	@Autowired
	public SecurityConfiguration(
			BCryptPasswordEncoder bCryptPasswordEncoder, 
			AccessDeniedHandler accessDeniedHandler,
			RoleHierarchy roleHierarchy){
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
		this.accessDeniedHandler = accessDeniedHandler;
		this.roleHierarchy = roleHierarchy;
	}
	
	
	private String userQuery = "select email, password, active from user where email=?";
	
	
	private String rolesQuery = "select u.email, r.role from user u inner join user_role ur on(u.user_id=ur.user_id) inner join role r on(ur.role_id=r.role_id) where u.email=?" ;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth)throws Exception{
		auth.
		jdbcAuthentication()
		.dataSource(dataSource)
		.usersByUsernameQuery(userQuery)
		.authoritiesByUsernameQuery(rolesQuery)
		.passwordEncoder(bCryptPasswordEncoder);
		
	}
	
    private SecurityExpressionHandler<FilterInvocation> webExpressionHandler() {
        DefaultWebSecurityExpressionHandler defaultWebSecurityExpressionHandler = new DefaultWebSecurityExpressionHandler();
        defaultWebSecurityExpressionHandler.setRoleHierarchy(roleHierarchy);
        return defaultWebSecurityExpressionHandler;
    }
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.
			authorizeRequests()
				.expressionHandler(webExpressionHandler()) // used with role hierarchy
				.antMatchers("/").permitAll()
				.antMatchers("/registration").permitAll()
				.antMatchers("/user/**").hasAuthority("USER")
				.antMatchers("/conspectus/all").permitAll()
				.antMatchers("/conspectus/**").hasAuthority("ADMIN")
				.anyRequest().authenticated()
				.and()
			.formLogin()
				.loginPage("/login").permitAll()
				.defaultSuccessUrl("/")
				.failureUrl("/login?error=true")
				.usernameParameter("email").passwordParameter("password")
				.and().csrf()
				.and()
			.logout()
				.permitAll()
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
				.logoutSuccessUrl("/").and()
			.exceptionHandling()
				//.accessDeniedPage("/access-denied"); // simply page without accessDeniedHandler
				.accessDeniedHandler(accessDeniedHandler);
		
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception{
		web
		.ignoring()
		.antMatchers("/resources/**");
	}

}