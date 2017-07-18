package p.p.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import p.p.entity.Conspectus;
import p.p.repository.ConspectusRepository;


@RestController
@RequestMapping("/rest")
public class ConspectusRestController {
	
	@Autowired
	ConspectusRepository conspectusRepository;

	@GetMapping("/all")
	public @ResponseBody List<Conspectus> getList(){
		return conspectusRepository.findAll();
	}
	
//	@GetMapping("/{id}")
//	public Book getBook(@PathVariable Long id){
//		return this.bookService.getById(id);
//	}
//	


}