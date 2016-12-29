package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index()
	{
		System.out.println("I am a controller");
		return "index";
	}
	@RequestMapping("/Sign")
	public String login()
	{
		System.out.println("login page is logged!!!");
		return "Sign";
	}
	@RequestMapping("/Register")
	public String request()
	{
		System.out.println("Register page is logged!!!");
		return "Register";
	}
	@RequestMapping("/About")
	public String Aboutus()
	{
		System.out.println("About us called");
		return "About";
	}
	@RequestMapping("/Service")
	public String Service()
	{
		System.out.println("Service is called");
		return "Service";
	}

}
