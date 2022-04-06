package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.services.ProductService;

// REST CONTROLLER
@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	@Autowired
	private ProductService service;
	
	// TESTING USER RESOURCE, FROM GET REQUISITION IN HTTP
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		
		// END POINT IMPLEMENTATION FOR GET ALL USERS
		List<Product> list = service.findAll();
		// RETURN A GOOD RESPONSE TO REQUISITON HTTP FROM PAGE BODY
		return ResponseEntity.ok().body(list);
	}
	
	// TESTING USER RESOURCE, FROM GET REQUISITION IN HTTP
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}