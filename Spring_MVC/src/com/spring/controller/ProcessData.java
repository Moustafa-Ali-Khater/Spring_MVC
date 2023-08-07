package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/process")
public class ProcessData {

	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/loginprocess")
	public String showingdatdformProcess(@RequestParam("user") String userName, @RequestParam("pass") String password, Model model) {
		
		String newUserName = "(ussername = " + userName.toUpperCase() + ")";
		String newPassword = "(password = " + password + ")";
		
		model.addAttribute("myUserName" , newUserName);
		model.addAttribute("myPassword" , newPassword);
		return "main";
	}
}
