package p.p.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import p.p.entity.Conspectus;
import p.p.entity.HomeworkExcercise;
import p.p.repository.ConspectusRepository;
import p.p.repository.HomeworkExcerciseRepository;

@RequestMapping("/homework")
@Controller
public class HomeworkExcerciseController {

	ConspectusRepository conspectusRepository;
	HomeworkExcerciseRepository homeworkExcerciseRepository;

	@Autowired
	public HomeworkExcerciseController(ConspectusRepository conspectusRepository,
			HomeworkExcerciseRepository homeworkExcerciseRepository) {
		this.conspectusRepository = conspectusRepository;
	}

	@RequestMapping(path = "/{id}")
	public String moviesPage(@PathVariable long id, Model model) {
		model.addAttribute("conspectus", conspectusRepository.findOne(id));

		return "HomeworkExcercise";

	}

	/*
	 * REST
	 */

	@GetMapping("/all")
	public @ResponseBody List<HomeworkExcercise> getList() {
		return homeworkExcerciseRepository.findAll();
	}

}
