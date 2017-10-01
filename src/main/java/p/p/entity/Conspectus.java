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

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "conspectus")
public class Conspectus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Getter @Setter Long id;

	@NotBlank
	private @Getter @Setter  String subject = "Temat: ";

	@ElementCollection
	@Column(length = 10000)
	@OrderColumn
	private @Getter @Setter  List<String> objectives = new ArrayList<>();

	@ElementCollection
	@Column(length = 10000)
	@OrderColumn
	private @Getter @Setter  List<String> materials = new ArrayList<>();

	@ElementCollection
	@Column(length = 10000)
	@OrderColumn
	private @Getter @Setter  List<String> methods = new ArrayList<>();

	@ElementCollection
	@Column(length = 10000)
	@OrderColumn
	private @Getter @Setter  List<String> scenarioIntroduction = new ArrayList<>();

	@ElementCollection
	@Column(length = 10000)
	@OrderColumn
	private @Getter @Setter  List<String> scenarioMain = new ArrayList<>();

	@ElementCollection
	@Column(length = 10000)
	@OrderColumn
	private @Getter @Setter  List<String> scenarioSummary = new ArrayList<>();

	@JsonIgnore
	@OneToMany(mappedBy = "conspectus", cascade = {CascadeType.REMOVE})
	private @Getter @Setter  List<HomeworkExcercise> homeworkExcercises;

}
