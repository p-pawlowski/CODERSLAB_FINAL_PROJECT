package p.p.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "lesson_outline")
public class LessonConspectus {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String subject;
	
	private String objective;
	
	private String materials;
	
	private String methods;
	
	private String scenarioIntroduction;
	
	private String scenatioMain;
	
	private String scenarioSummary;
	
	private String notes;
	
	private Integer time;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getObjective() {
		return objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}

	public String getMaterials() {
		return materials;
	}

	public void setMaterials(String materials) {
		this.materials = materials;
	}

	public String getMethods() {
		return methods;
	}

	public void setMethods(String methods) {
		this.methods = methods;
	}

	public String getScenarioIntroduction() {
		return scenarioIntroduction;
	}

	public void setScenarioIntroduction(String scenarioIntroduction) {
		this.scenarioIntroduction = scenarioIntroduction;
	}

	public String getScenatioMain() {
		return scenatioMain;
	}

	public void setScenatioMain(String scenatioMain) {
		this.scenatioMain = scenatioMain;
	}

	public String getScenarioSummary() {
		return scenarioSummary;
	}

	public void setScenarioSummary(String scenarioSummary) {
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
