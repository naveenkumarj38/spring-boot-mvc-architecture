package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nav.model.Person;

@Controller
public class PersonController {
	@RequestMapping(value = "/person")
	public String person(Model model){
		Person p = new Person();
		p.setName("naveen");
		p.setAge(24);
		p.setAddress("Bangalore");
		model.addAttribute("person", p);

		return "personview";

	}

	@ResponseBody
	@RequestMapping("/")
	String entry(){
		return "my spring boot app";
	}
}
