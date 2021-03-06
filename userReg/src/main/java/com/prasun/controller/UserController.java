package com.prasun.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.prasun.entities.UserEntity;
import com.prasun.repos.UserRepository;
import com.prasun.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService service;
	
	@Autowired
	private UserRepository userRepo;
	
	@RequestMapping("/showCreate")
	public String showCreate() {
		return "CreateUser";
	}
	
	@RequestMapping("/saveUser")
	public String saveUser(@ModelAttribute("user") UserEntity user, Model model)
	{
		UserEntity saveUser = service.saveUser(user);
		String msg="User saved with id:" +saveUser.getId();
		model.addAttribute("msg", msg);
		return "CreateUser";
	}
	
	@RequestMapping("/displayUser")
	public String displayUser(Model model) {
		
		List<UserEntity> users = service.getAllUser();
		model.addAttribute("users", users);
		return "displayUsers";
		
	}
	
	@RequestMapping("/editUser")
	public String editUser(@RequestParam("id")int id, Model model) {
		
		UserEntity users = service.getUserEntityById(id);
		model.addAttribute("users", users);
		return "editUser";
	}
	@RequestMapping("/updateUser")
	public String updateUser(@ModelAttribute("user") UserEntity user, Model model)
	{
		service.updateUser(user);
		List<UserEntity> users = service.getAllUser();
		model.addAttribute("users", users);
		return "displayUsers";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("email")String email,@RequestParam("password") String password, Model model) {
		UserEntity user=userRepo.findByEmail(email);
		if(user.getPassword().equals(password)) {
			return "welcome";
		}
		else {
			model.addAttribute("msg", "invalid user name or password . Please try again");
		}
		return "login";
		
	}
}
