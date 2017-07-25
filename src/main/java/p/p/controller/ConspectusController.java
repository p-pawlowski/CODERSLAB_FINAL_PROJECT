package p.p.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import p.p.entity.Conspectus;

import p.p.repository.ConspectusRepository;

@RequestMapping("/conspectus")
@Controller
public class ConspectusController {

	@Autowired
	ConspectusRepository conspectusRepository;

	@RequestMapping(path = "/add", method = RequestMethod.GET)
	public String addConspectusForm(Model model) {
		model.addAttribute("conspectus", new Conspectus());

		return "ConspectusForm";
	}

	@RequestMapping(path = "/add", method = RequestMethod.POST)
	public String processAddConspectusForm(@ModelAttribute Conspectus conspectus) {
		conspectusRepository.save(conspectus);

		return "redirect:" + conspectus.getId();
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public String getConspectus(@PathVariable long id, Model model) {
		Conspectus conspectus = conspectusRepository.findOne(id);
		model.addAttribute("conspectus", conspectus);

		return "Conspectus";
	}

	@RequestMapping(path = "edit/{id}", method = RequestMethod.GET)
	public String editConspectus(@PathVariable long id, Model model) {
		model.addAttribute("conspectus", conspectusRepository.findOne(id));

		return "ConspectusFormEdit";
	}

	@RequestMapping(path = "edit/{id}", method = RequestMethod.POST)
	public String editConspectus(@ModelAttribute Conspectus conspectus) {
		conspectusRepository.save(conspectus);
		return "redirect:../" + conspectus.getId();
	}

	@RequestMapping(path = "delete/{id}", method = RequestMethod.GET)
	public String deleteConspectus(@PathVariable long id) {
		Conspectus conspectus = conspectusRepository.findOne(id);
		conspectusRepository.delete(conspectus);
		return "redirect:../main";
	}

	@RequestMapping(path = "main")
	public String mainPage(Model model) {

		return "MainPage";

	}

	// @RequestMapping(path = "/movies/{id}")
	// public String moviesPage(@PathVariable long id, Model model){
	// model.addAttribute("conspectus", conspectusRepository.findOne(id));
	//
	// return "movies";
	//
	// }

}