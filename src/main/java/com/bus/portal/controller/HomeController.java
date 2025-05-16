package com.bus.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("home")
	public String home()
	{
		return "templates/index.jsp";
	}
	@RequestMapping("registration")
	public String registration()
	{
		return "templates/registration.jsp";
	}
	@RequestMapping("login")
	public String login()
	{
		return "templates/index.jsp";
	}
	@RequestMapping("adminLogin")
	public String adminLogin()
	{
		return "templates/adminLogin.jsp";
	}
	@RequestMapping("userLogin")
	public String userLogin()
	{
		return "templates/userLogin.jsp";
	}
}