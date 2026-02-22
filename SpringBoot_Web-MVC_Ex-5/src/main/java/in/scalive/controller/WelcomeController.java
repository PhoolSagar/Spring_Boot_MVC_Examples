package in.scalive.controller;



import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class WelcomeController {

	@RequestMapping(method = RequestMethod.GET, value = "/showDate")
	public String showDateTime(HttpSession sess) {
		Date date = new Date();
		sess.setAttribute("dateTime", date);
		return "demo.jsp";
	}

}
