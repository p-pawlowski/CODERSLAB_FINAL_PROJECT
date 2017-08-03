package p.p.entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "excercise")
public class Excercise {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	@Column(length = 10000)
	private String title;

	@Column(length = 10000)
	private String description;

	@NotNull
	@ManyToOne
	private Conspectus conspectus;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Conspectus getConspectus() {
		return conspectus;
	}

	public void setConspectus(Conspectus conspectus) {
		this.conspectus = conspectus;
	}

}
