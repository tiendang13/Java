package com.tien.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.tien.model.User;
import com.tien.services.UserService;

@Controller
@SessionAttributes("/user")
public class LoginController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello() {
		return "welcome";
	}

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(Model model) {
		User user = new User();
		model.addAttribute("userLogin", user);
		return "login";
	}
  
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@ModelAttribute("userLogin") User user) {
		boolean found = userService.login(user.getUsername(), user.getPassword());
		if (found) {				
			return "success";
		} else {				
			return "failure";
		}
	}
	@RequestMapping(value="/signup", method=RequestMethod.GET)
	public String signup(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "signup";
	}

	@RequestMapping(value="/signup", method=RequestMethod.POST)
	public String signup(@ModelAttribute("user") User user, Model model) {
		if(userService.signUp(user.getUsername())) {
			model.addAttribute("message", "User Name exists. Try another user name");
			return "signup";
		} else {
			userService.insertUser(user);;
			model.addAttribute("message", "Saved student details");
			return "redirect:login.jsp";
		}
	  }
}
