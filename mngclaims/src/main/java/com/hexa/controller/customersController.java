package com.hexa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import com.hexa.models.customers;
import com.hexa.service.CustomerService;


@Controller
@RequestMapping(value = "/api/v1/", produces = MediaType.APPLICATION_JSON_VALUE)
public class customersController  {
	
	@Autowired
	private CustomerService customerService; 
	
	@GetMapping(path="customer")
	public ResponseEntity<List<customers>> showAllCustomer(){
		
		return new ResponseEntity<>(customerService.showAllCustomers(),HttpStatus.OK);
	}
	
	@PostMapping(path="customer")
	public ResponseEntity<customers> createCustomer(@Validated @RequestBody customers c){
		
		return new ResponseEntity<>(customerService.createCustomer(c),HttpStatus.OK);

	}
	
	

}
