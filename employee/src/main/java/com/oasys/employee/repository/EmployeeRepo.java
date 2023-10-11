package com.oasys.employee.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.oasys.employee.endity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
@Query(value = "select * from employee_deteils where age>?",nativeQuery = true)
public List<Employee> getbyage(int age);
	
@Query(value = "select * from employee_deteils where salary>?",nativeQuery = true)
public List<Employee> getbysalary(int salary);
}
