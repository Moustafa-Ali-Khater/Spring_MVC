package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("")
public class MainController {

	
	@RequestMapping("/")
	public String main() {
		return "mainpage";
	}
	
	@RequestMapping("/profile")
	public String myPro() {
		return "my profile";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	/*@RequestMapping("/loginprocess")
	public String showingdatdformProcess(HttpServletRequest request, Model model) {
		
		String userName = request.getParameter("user");
		String password = request.getParameter("pass");
		
		String newUserName = "(ussername = " + userName.toUpperCase() + ")";
		String newPassword = "(password = " + password + ")";
		
		model.addAttribute("myUserName" , newUserName);
		model.addAttribute("myPassword" , newPassword);
		return "main";
	}*/
	
	@RequestMapping("/loginprocess")
	public String showingdatdformProcess(@RequestParam("user") String userName, @RequestParam("pass") String password, Model model) {
		
		String newUserName = "(ussername = " + userName.toUpperCase() + ")";
		String newPassword = "(password = " + password + ")";
		
		model.addAttribute("myUserName" , newUserName);
		model.addAttribute("myPassword" , newPassword);
		return "main";
	}
}


































