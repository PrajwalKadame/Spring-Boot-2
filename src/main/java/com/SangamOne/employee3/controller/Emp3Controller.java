package com.SangamOne.employee3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SangamOne.employee3.entity.Emp3;
import com.SangamOne.employee3.service.Emp3Service;

@RestController
@RequestMapping(value="/emp")
public class Emp3Controller {

	@Autowired
	Emp3Service emp3Service;
	
	 @PostMapping
	 public String addValues(@RequestBody Emp3 emp) {
		 
		 System.out.println("Test");
		 emp3Service.createEmp3(emp);
		 return "Inserted";
	 }
		
	
}
