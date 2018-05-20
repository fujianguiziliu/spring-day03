package com._520it._01_spring_jdbc.service;

import java.util.List;

import com._520it._01_spring_jdbc.domain.Employee;

public interface IEmployeeService {

void save(Employee e);
	
	Employee get(Long id);
	
	List<Employee> list();
}
