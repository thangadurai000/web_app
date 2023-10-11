package com.oasys.employee.dao;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oasys.employee.endity.Employee;
import com.oasys.employee.repository.EmployeeRepo;
@Repository
public class Employeedao {
	@Autowired
	EmployeeRepo emposo;
	public String insertEmployee(Employee e) {
	
		emposo.save(e);
		return "success";
	}
	
	public String insertEmployee1(List<Employee> e) {
	
		 emposo.saveAll(e);
		 return "suceess all";
	}
	public Optional<Employee>getvalue(int num){
		return emposo.findById(num);
	}

	public String delete(int num) {
	
				emposo.deleteById(num);
				return "delete";
	}

	public List<Employee> getall() {
		// TODO Auto-generated method stub
		return emposo.findAll();
	}


	

}
