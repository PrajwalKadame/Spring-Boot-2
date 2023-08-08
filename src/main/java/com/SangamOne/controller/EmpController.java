package com.SangamOne.controller;

import java.util.List;

import org.apache.coyote.http11.Http11InputBuffer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.SangamOne.entity.Employee;
import com.SangamOne.repository.EmpRepo;
import com.SangamOne.service.EmpService;

import jakarta.servlet.http.HttpSession;

@Controller
public class EmpController {
	@Autowired
	EmpService service;
	
	@GetMapping("/")
	public String home(Model m) {
		List<Employee> emp=service.getAllEmp();
		m.addAttribute("emp", emp);
		return "Index";
	}
	
	@GetMapping("/addemp")
	public String addEmpForm() {
		return "add_emp";
	}
	
	@PostMapping("/register")
	public String empRegister(@ModelAttribute Employee e, HttpSession session) {
	System.out.println(e);
	service.addEmp(e);
	session.setAttribute("msg", "Emp added successfully...");
	return "redirect:/";
	}
	
	@GetMapping("/edit{id}")
	public String edit(@PathVariable int id, Model m) {
		Employee e=service.getEmpId(id);
		m.addAttribute("emp", e);
		return "edit";
	}
	
	@PostMapping("/update")
	public String updateEmp(@ModelAttribute Employee e, HttpSession session) {
		service.addEmp(e);
		session.setAttribute("msg", "Emp Data Update Sucessfully..");
		return "redirect:/";
	}

	@GetMapping("/delete/{id}")
	public String deleteEMp(@PathVariable int id, HttpSession session) {

		service.deleteEmp(id);
		session.setAttribute("msg", "Emp Data Delete Sucessfully..");
		return "redirect:/";
	}

}
