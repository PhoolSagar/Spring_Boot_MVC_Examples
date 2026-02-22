package in.scalive.controller;



import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;



@Controller
public class WelcomeController {

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String homePage() {
		return "index.html";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/greet")
	public String greetings(@RequestParam(name="fno")Integer fno,@RequestParam(name ="sno")Integer sno, Model m) {
	
		int sum= fno + sno;
		m.addAttribute("fno",fno);
		m.addAttribute("sno",sno);
		m.addAttribute("sum",sum);
		return "sum.jsp";
	}
}
