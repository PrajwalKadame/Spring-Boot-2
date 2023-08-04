package com.SangamOne.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SangamOne.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer>{

}
