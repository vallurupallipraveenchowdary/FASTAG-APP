package com.praveen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import com.praveen.domain.Login;


@Controller
public class LoginController {
	
	@RequestMapping(value="/index" )
	public String displayhome(Model model) {
		
		Login login = new Login();
		
		model.addAttribute("loginObj", login);
		
		return "home";
		
	}

}
