package p.p.entity;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;

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
	@Column(length=10000)
	private List<String> objectives = new ArrayList<>();
	

	@ElementCollection
	@Column(length=10000)
	private List<String> materials = new ArrayList<>();
	
	@ElementCollection
	@Column(length=10000)
	private List<String> methods = new ArrayList<>();
	
	@ElementCollection
	@Column(length=10000)
	private List<String> scenarioIntroduction = new ArrayList<>();
	
	@ElementCollection
	@Column(length=10000)
	private List<String> scenarioMain = new ArrayList<>();
	
	@ElementCollection
	@Column(length=10000)
	private List<String> scenarioSummary = new ArrayList<>();
	
	private String notes;
	
	private Integer time;

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

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Integer getTime() {
		return time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	
	
	
	
	
}
