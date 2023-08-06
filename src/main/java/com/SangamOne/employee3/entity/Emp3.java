package com.SangamOne.employee3.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;


@Entity
@Table(name="emp_details")
public class Emp3 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="emp_id")
	private int EmpId;
	
	@Column(name="emp_name")
	private String EmpName;

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	

	
	
}
