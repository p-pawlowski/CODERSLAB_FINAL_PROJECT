package p.p.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.hierarchicalroles.RoleHierarchy;
import org.springframework.security.access.hierarchicalroles.RoleHierarchyImpl;

@Configuration
public class BeanConfiguration {

	@Bean
	public RoleHierarchy roleHierarchy(){		
		RoleHierarchyImpl roleHierarchy = new RoleHierarchyImpl();
		roleHierarchy.setHierarchy("ADMIN > MODERATOR MODERATOR > USER");
		return roleHierarchy; 
	}
	
}
