package com.caveofprogramming.spring.web.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OffersController {

//	@RequestMapping("/")
//	public String showHome(HttpSession session)
//	{
//		session.setAttribute("name", "Rahul");
//		return "home";
//	}
	
	@RequestMapping("/")
	public ModelAndView showHome()
	{
		ModelAndView mv = new ModelAndView("home");
		Map<String,Object>model=mv.getModel();
		model.put("name", "<b>Rahul</>");
		return mv;
	}
}
