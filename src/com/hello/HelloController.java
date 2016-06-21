package com.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String printHello(ModelMap model){
		model.addAttribute("message", "Hi This is Gayathri");
		return "hello";
	}
	
	@RequestMapping(value = "/studentPage", method = RequestMethod.GET)
	public ModelAndView displayStudent(Model m){
		Student s = new Student();
		s.setId(1);
		s.setName("Gayathri");
		s.setAge(25);
		m.addAttribute("student1", s);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("studentDetails");
		return mv;
	}
}
