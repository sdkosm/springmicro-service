package com.microservice.deepak.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;


import com.microservice.deepak.modals.Department;
import com.microservice.deepak.service.DepartmentService;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	//save department
	
	  @PostMapping("/")
	    public Department saveDepartment(@RequestBody Department department) {
	        log.info("Inside saveDepartment method of DepartmentController");
	        return  departmentService.saveDepartment(department);
}
	  
	   @GetMapping("/{id}")
	    public Department findDepartmentById(@PathVariable("id") Long departmentId) {
	        log.info("Inside findDepartmentById method of DepartmentController");
	        return departmentService.findDepartmentById(departmentId);
	    }
}