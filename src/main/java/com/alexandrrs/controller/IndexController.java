package com.alexandrrs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping(value="/")
	public ModelAndView mainPage()
	{
		ModelAndView modelAndView = new ModelAndView("home");
		String message = "Users";
		modelAndView.addObject("message", message);
		return modelAndView;
	}

	@RequestMapping(value = "/index")
	public ModelAndView indexPage()
	{
		return mainPage();
	}
}