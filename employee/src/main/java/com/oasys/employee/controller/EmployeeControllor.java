package com.oasys.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oasys.employee.endity.Employee;
import com.oasys.employee.service.EmployeeService;

import Exception.AgeNotFoundException;
import Exception.salaryNotFoundException;

@RestController
@RequestMapping("/employee")
public class EmployeeControllor {
	@Autowired
	EmployeeService empser;

	@PostMapping(value = "/add")
	public String insertEmployee(@RequestBody Employee e) {
		return empser.insertEmployee(e);
	}

	@GetMapping(value = "adds")
	public String insertEmployee1(@RequestBody List<Employee> e) {
		return empser.insertEmployee1(e);
	}

	@GetMapping(value = "/findbyid")
	public Optional<Employee> getvalue(@RequestBody int num) {
		return empser.getvalue(num);
	}

	@DeleteMapping(value = "delete")
	public String delete(@RequestBody int num) {

		return empser.delete(num);

	}

	@GetMapping(value = "/getall")
	public List<Employee> getall() {
		return empser.getall();
	}
	@GetMapping(value="/getmaxage")
	public Employee getmaxage() {
		return empser.getmaxage();
	}
	@GetMapping(value ="/getbyage")
	public List<Employee> getbyage(@RequestParam int age) throws AgeNotFoundException{
		return empser.getbyage(age );
	}
	@GetMapping(value="getbysalary")
	public List<Employee> getbysalary(@RequestParam int salary)throws salaryNotFoundException {
		return empser.getbysalary1(salary);
	}
	
}
