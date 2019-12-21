package com.face.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

 @Controller
 
	public class HelloController {

	@RequestMapping(value="/")
	public String index() {

	return "index";
	}
	@RequestMapping(value="/login")
	public String login() {

	return "login";
	}
	@RequestMapping(value="/register")
	public String register() {

	return "register";
	}

	@RequestMapping(value="/hello")
	public ModelAndView hello(HttpServletRequest request, HttpServletResponse response) {

	String username = request.getParameter("t1");
	String password = request.getParameter("t2");
    
	ModelAndView mv = new ModelAndView();
	mv.setViewName("welcome");
	mv.addObject("username",username);
	
	return mv;
	}
	@RequestMapping(value="/success")
	public ModelAndView success(HttpServletRequest request, HttpServletResponse response) {

	
	ModelAndView mv = new ModelAndView();
	
	String fname = request.getParameter("fname");
    String lname = request.getParameter("lname");
	mv.setViewName("succreg");
	mv.addObject("fname",fname);
	mv.addObject("lname",lname);
	return mv;
	}

}
