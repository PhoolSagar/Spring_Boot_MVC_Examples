package in.scalive.controller;



import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class WelcomeController {

	@RequestMapping(method = RequestMethod.GET, value = "/showDate")
	public String showDateTime(Model m) {
		Date date = new Date();
		m.addAttribute("dateTime", date);
		return "demo.jsp";
	}

}
