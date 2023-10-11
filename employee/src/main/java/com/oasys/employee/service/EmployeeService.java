package com.oasys.employee.service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.oasys.employee.dao.Employeedao;
import com.oasys.employee.endity.Employee;
import com.oasys.employee.repository.EmployeeRepo;

import Exception.AgeNotFoundException;
import Exception.salaryNotFoundException;
@Service
public class EmployeeService {
@Autowired
Employeedao empdao;
@Autowired EmployeeRepo emprep;
public String insertEmployee(Employee e) {

	return empdao.insertEmployee(e);
	
	
}
public String insertEmployee1(List<Employee> e) {
	return empdao.insertEmployee1(e);
}
public Optional<Employee> getvalue(int num) {
	return empdao.getvalue(num);
}
public String delete ( int num) {
	return empdao.delete(num);
}
public List<Employee> getall() {
	// TODO Auto-generated method stub
	return empdao.getall();
}
public Employee getmaxage() {
	List<Employee> emps = this.getall();
	return emps.stream().max(Comparator.comparing(Employee::getAge)).get();
}
public List<Employee> getbyage(int age) throws AgeNotFoundException{
	
	List<Employee> val= emprep.getbyage(age);
	if(val.isEmpty()) {
		throw new AgeNotFoundException("age not in this list");
	}
	else {
		return val;
	}
}

public List<Employee> getbysalary1(int salary) throws salaryNotFoundException {
	List<Employee> emps=emprep.getbysalary(salary);
	if(emps.isEmpty()) {
		throw new salaryNotFoundException("salary not found");
	}
	else {
		return emps;
	}
}


}
