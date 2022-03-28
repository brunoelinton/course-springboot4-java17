package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.services.UserService;

// REST CONTROLLER
@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService service;
	
	// TESTING USER RESOURCE, FROM GET REQUISITION IN HTTP
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		
		// END POINT IMPLEMENTATION FOR GET ALL USERS
		List<User> list = service.findAll();
		// RETURN A GOOD RESPONSE TO REQUISITON HTTP FROM PAGE BODY
		return ResponseEntity.ok().body(list);
	}
	
	// TESTING USER RESOURCE, FROM GET REQUISITION IN HTTP
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
