package com.springwebservice.controller;


import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/")
public class HomeController {
	

	@RequestMapping("/")
    public ModelAndView index(Map<String, Object> model, HttpServletRequest request){

        return new ModelAndView("home");
    }

	
}