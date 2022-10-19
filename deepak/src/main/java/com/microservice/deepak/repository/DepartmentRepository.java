package com.microservice.deepak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.deepak.modals.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

	Department findByDepartmentId(Long departmentId);
	
}
