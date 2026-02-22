package in.scalive.controller;




import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.scalive.model.Student;

@Controller
public class StudentController {

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String homePage() {
		return "index";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/greet")
	public String greetings(@ModelAttribute() Student student) {
		return "student";
	}
	
	@ModelAttribute("currtime")
	public String setUpTime() {
		System.out.println("setUpTime called.......");
		LocalTime lTime = LocalTime.now();
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("hh:mm:ss a");
		return lTime.format(dft);
	}
}
