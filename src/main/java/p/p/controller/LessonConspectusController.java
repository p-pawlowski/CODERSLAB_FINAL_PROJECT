package p.p.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import p.p.entity.LessonConspectus;
import p.p.repository.LessonConspectusRepository;


@RequestMapping("/conspectus")
@Controller
public class LessonConspectusController {
	
	@Autowired
	LessonConspectusRepository conspectusRepository;
	
	@RequestMapping(path="/add", method = RequestMethod.GET)
	public String showAuthorkForm(Model model){
		model.addAttribute("lessonConspectus", new LessonConspectus());
		return "LessonConspectusForm";
	}

}
