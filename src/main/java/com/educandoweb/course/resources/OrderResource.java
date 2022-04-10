package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.services.OrderService;

// REST CONTROLLER
@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

	@Autowired
	private OrderService service;
	
	// TESTING USER RESOURCE, FROM GET REQUISITION IN HTTP
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		
		// END POINT IMPLEMENTATION FOR GET ALL ORDERS
		List<Order> list = service.findAll();
		// RETURN A GOOD RESPONSE TO REQUISITON HTTP FROM PAGE BODY
		return ResponseEntity.ok().body(list);
	}
	
	// TESTING ORDER RESOURCE, FROM GET REQUISITION IN HTTP
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
