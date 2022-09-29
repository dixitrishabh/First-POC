package com.project.myproject.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.myproject.model.User;
import com.project.myproject.repository.UserRepository;

@RestController                       //handle all restsapi (get,post,put,patch,delete)
@CrossOrigin("http://localhost:3000") //for connecting with frontend

public class UserContoller {

	@Autowired             //enables you to inject the object dependency implicitly
	private UserRepository userRepository;
	
	
	 @PostMapping("/user")
	    User newUser(@RequestBody User newUser) {
	        return userRepository.save(newUser);
	    }
	 
	   @GetMapping("/users")
	    List<User> getAllUsers() {
	        return userRepository.findAll();
	    }
}
