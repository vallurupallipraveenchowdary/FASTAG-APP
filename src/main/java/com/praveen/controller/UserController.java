
package com.praveen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.praveen.domain.UserDetails;
import com.praveen.entity.UserDetailsEntity;

import com.praveen.service.UserServiceImpl;

@Controller
public class UserController {
	
	@Autowired
	public UserServiceImpl userServiceImpl;
	
	@RequestMapping(value="/displaySignupForm")
	public String init(Model model) {
		
		UserDetails user = new UserDetails();
		
		model.addAttribute("userObj",user);
		return "signup";
	}
	
	@RequestMapping(value="/saveUserDetails", method=RequestMethod.POST)
	public String handleSignUpBtn(@ModelAttribute("userObj") UserDetails user, Model model ) {
		
		UserDetailsEntity userData = userServiceImpl.saveUserDetails(user);
		
		
		if(userData!= null) {
			model.addAttribute("SccMsg", "User Data  Inserted Succesfully In DataBase");
		}else {
			model.addAttribute("ErrMsg", "Data Not Inserted");
		}
		
		return "sucess";
	}

}
