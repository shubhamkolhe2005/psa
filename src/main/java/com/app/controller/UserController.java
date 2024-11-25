package com.app.controller;

import com.app.exceptions.UserException;
import com.app.model.User;
import com.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;



@RestController
public class UserController {
	
	@Autowired
	private UserService usi;
	
	@PostMapping("/user")
	public ResponseEntity<User> registerUser(@Valid @RequestBody User user) throws UserException
	{
		User us = usi.addAUser(user);
		
		return new ResponseEntity<User>(us,HttpStatus.CREATED);
	}
	
	@PutMapping("/user/{key}")
	public ResponseEntity<User> updateUser(@Valid @RequestBody User user,@PathVariable("key") String key) throws UserException
	{
		User us = usi.updateUser(user, key);
		
		return new ResponseEntity<User>(us,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/user/{id}/{key}")
	public ResponseEntity<User> deleteUser(@PathVariable("id") Integer id,@PathVariable("key") String key) throws UserException
	{
		
        User us = usi.deleteUser(id, key);
		
		return new ResponseEntity<User>(us,HttpStatus.OK);
	}
	
	@GetMapping("/user/{id}/{key}")
	public ResponseEntity<User> viewUser(@PathVariable("id") Integer id,@PathVariable("key") String key) throws UserException
	{
		
        User us = usi.viewUserById(id, key);
		System.out.println("ok");

		return new ResponseEntity<User>(us,HttpStatus.OK);
	}
	
	
	@GetMapping("/user/{key}")
	public ResponseEntity<List<User>> viewAllUser(@PathVariable("key") String key) throws UserException
	{
		
         List<User> list = usi.viewAllUsers(key);
		
		return new ResponseEntity<List<User>>(list,HttpStatus.OK);
	}


	
	
	
	
	
	

}
