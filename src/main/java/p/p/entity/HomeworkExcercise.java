package p.p.entity;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "excercise")
public class HomeworkExcercise {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Getter @Setter  Long Id;

	@Column(length = 10000)
	private @Getter @Setter String title;

	@Column(length = 10000)
	private @Getter @Setter String description;

	@NotNull
	@ManyToOne
	private @Getter @Setter  Conspectus conspectus;

}
