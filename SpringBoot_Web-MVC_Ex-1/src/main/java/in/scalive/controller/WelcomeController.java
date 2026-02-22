package in.scalive.controller;



import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/greet")
	@ResponseBody
	public String welcome() {
		return "<h1>Welcome to my first Spring Web MVC App</h1>";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/date")
	@ResponseBody
	public String showDate() {
		
		Date today = new Date();
		return today.toString();
	}
}
