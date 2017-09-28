package p.p.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DefaultController {
	
	@RequestMapping(path = {"/", "main"}, method = RequestMethod.GET)
	public String mainPage() {
		return "MainPage";

	}
	
	
	@RequestMapping(value="/access-denied")
	public String accessDenied(){
		return "access-denied";
	}

}
