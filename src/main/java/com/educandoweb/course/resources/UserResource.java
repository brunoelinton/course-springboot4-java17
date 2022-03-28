package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

// REST CONTROLLER
@RestController
@RequestMapping(value = "/users")
public class UserResource {

	// TESTING USER RESOURCE, FROM GET REQUISITION IN HTTP
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "12345");
		// RETURN A GOOD RESPONSE TO REQUISITON HTTP FROM PAGE BODY
		return ResponseEntity.ok().body(u);
	}
}