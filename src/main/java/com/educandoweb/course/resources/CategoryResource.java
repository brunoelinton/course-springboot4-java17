package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.services.CategoryService;

// REST CONTROLLER
@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@Autowired
	private CategoryService service;
	
	// TESTING USER RESOURCE, FROM GET REQUISITION IN HTTP
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		
		// END POINT IMPLEMENTATION FOR GET ALL USERS
		List<Category> list = service.findAll();
		// RETURN A GOOD RESPONSE TO REQUISITON HTTP FROM PAGE BODY
		return ResponseEntity.ok().body(list);
	}
	
	// TESTING USER RESOURCE, FROM GET REQUISITION IN HTTP
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
