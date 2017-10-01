package p.p.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	@Getter @Setter private int id;
	
	@Column(name="email")
	@Email(message="*Please provide a valid Email")
	@NotEmpty(message = "*Please provide an email")
	@Getter @Setter private  String email;
	
	@Column(name="password")
	@Length(min=5, message = "*Your Password must have at least 5 charakters")
	@NotEmpty(message="*Please provide your password*")
	//@Transient
	@Getter @Setter private String password;
	
	@Column(name="name")
	@NotEmpty(message = "*Please provide your name*")
	@Getter @Setter private String name;
	
	@Column(name = "last_name")
	@NotEmpty(message = "Please provide your last name*")
	@Getter @Setter private String lastName;
	
	@Column(name="active")
	@Getter @Setter private int active;
	
	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	@Getter @Setter private Set<Role> roles;
	
}