package in.scalive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.scalive.model.Student;

@Controller
public class StudentController {

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String homePage() {
		return "index.html";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/greet")
	public String greetings(@ModelAttribute() Student student) {
		return "student.jsp";
	}
	
}
