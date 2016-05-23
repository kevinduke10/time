package com.kevco.time.rest;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.kevco.time.model.User;
import com.kevco.time.controller.UserController;

@RestController
@RequestMapping("/user")
public class UserRestService {
	@Autowired
	UserController userController;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	@ResponseBody
	public Iterable<User>findAll() {
		return userController.findAll();
	}
	
	@RequestMapping(value="/all", method=RequestMethod.DELETE)
	public void deleteAll() {
		 userController.deleteAll();
	}
	
	@CrossOrigin(origins = "http://127.0.0.1:8081")
	@RequestMapping(value="/login/{email}/{password}", method=RequestMethod.POST)
	public boolean login(@PathVariable("email")String email , @PathVariable("password")String password) {
		System.out.print("Attempting to login: " + email); 
		return userController.login(email , password);
	}
	
	@RequestMapping(value="/{firstName}/{lastName}/{email}", method=RequestMethod.POST)
	public Map<String,Object>insertUserParams(@PathVariable("firstName") String fn,
			@PathVariable("lastName") String ln,@PathVariable("email") String email) {
		System.out.println(fn +" " + ln + " " + email);
		Map<String,Object> response = new LinkedHashMap<String,Object>();
		userController.save(new User(fn,ln,email));
		response.put("message", "User created");
	    return response;
	  }
	
	@RequestMapping(value="/setPass/{email}/{password}", method=RequestMethod.PUT)
	public Map<String,Object>setPass(@PathVariable("email") String email,
			@PathVariable("password") String ln,@PathVariable("password") String password) {
		Map<String,Object> response = new LinkedHashMap<String,Object>();
		boolean passwordSet = userController.setPass(email,password);
		if(passwordSet)
			response.put("message", "Password Set");
		else
			response.put("message", "Failed to set password");
		
	    return response;
	  }
	
	@RequestMapping(value="/", method=RequestMethod.POST, consumes="application/json")
	@ResponseBody
	public Map<String,Object>insert(@RequestBody User user) {
	Map<String,Object> response = new LinkedHashMap<String,Object>();

		if (user.getFirstName() == null || user.getLastName() == null || 
				user.getEmail() == null){
			response.put("message", "User Creation Failed");
			return response;
		}
		
		if (userController.findByEmail(user.getEmail()) == null){
			User newUser = new User(user.getFirstName(),user.getLastName(),user.getEmail());
		    userController.save(newUser);
			response.put("message", "User created");
			response.put("user", newUser);
		    return response;
		}else{
			response.put("message", "Email already used");
			return response;
		}
	  } 
}
