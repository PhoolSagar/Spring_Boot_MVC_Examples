package in.scalive.controller;



import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;





@Controller
public class WelcomeController {

	@RequestMapping(method = RequestMethod.GET, value = "/showDate")
	public ModelAndView showDateTime() {
		ModelAndView mv = new ModelAndView();
		Date date = new Date();
		
		mv.addObject(date);
		mv.addObject("msg", "What's going on?");
		
		mv.setViewName("demo.jsp");
		return mv;
	}

}
