package p.p.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotBlank;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "conspectus")
public class Conspectus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String subject = "Temat: ";

	@ElementCollection
	@Column(length = 10000)
	@OrderColumn
	private List<String> objectives = new ArrayList<>();

	@ElementCollection
	@Column(length = 10000)
	@OrderColumn
	private List<String> materials = new ArrayList<>();

	@ElementCollection
	@Column(length = 10000)
	@OrderColumn
	private List<String> methods = new ArrayList<>();

	@ElementCollection
	@Column(length = 10000)
	@OrderColumn
	private List<String> scenarioIntroduction = new ArrayList<>();

	@ElementCollection
	@Column(length = 10000)
	@OrderColumn
	private List<String> scenarioMain = new ArrayList<>();

	@ElementCollection
	@Column(length = 10000)
	@OrderColumn
	private List<String> scenarioSummary = new ArrayList<>();

	@JsonIgnore
	@OneToMany(mappedBy = "conspectus", cascade = {CascadeType.REMOVE})
	private List<Excercise> excercises;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public List<String> getObjectives() {
		return objectives;
	}

	public void setObjectives(List<String> objectives) {
		this.objectives = objectives;
	}

	public List<String> getMaterials() {
		return materials;
	}

	public void setMaterials(List<String> materials) {
		this.materials = materials;
	}

	public List<String> getMethods() {
		return methods;
	}

	public void setMethods(List<String> methods) {
		this.methods = methods;
	}

	public List<String> getScenarioIntroduction() {
		return scenarioIntroduction;
	}

	public void setScenarioIntroduction(List<String> scenarioIntroduction) {
		this.scenarioIntroduction = scenarioIntroduction;
	}

	public List<String> getScenarioMain() {
		return scenarioMain;
	}

	public void setScenarioMain(List<String> scenarioMain) {
		this.scenarioMain = scenarioMain;
	}

	public List<String> getScenarioSummary() {
		return scenarioSummary;
	}

	public void setScenarioSummary(List<String> scenarioSummary) {
		this.scenarioSummary = scenarioSummary;
	}

	public List<Excercise> getExcercises() {
		return excercises;
	}

	public void setExcercises(List<Excercise> excercises) {
		this.excercises = excercises;
	}
	

}
