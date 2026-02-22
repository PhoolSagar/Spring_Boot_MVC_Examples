package in.scalive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String homePage() {
		return "index.html";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/greet")
	public String greetings(@RequestParam(name = "fno") String fno, @RequestParam(name = "sno") String sno, Model m) {
		boolean result = true;
		
		try {
			int a = Integer.parseInt(fno);
			int b = Integer.parseInt(sno);

			int sum = a + b;
			m.addAttribute("fno", fno);
			m.addAttribute("sno", sno);
			m.addAttribute("sum", sum);
			

		} catch (NumberFormatException ex) {
			result = false;
		}
		m.addAttribute("result", result);
		return "sum.jsp";
	}
}
