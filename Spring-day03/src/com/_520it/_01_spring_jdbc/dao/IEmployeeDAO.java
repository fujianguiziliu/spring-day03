package com._520it._01_spring_jdbc.dao;

import java.util.List;

import com._520it._01_spring_jdbc.domain.Employee;

public interface IEmployeeDAO {

	void save(Employee e);
	
	Employee get(Long id);
	
	List<Employee> list();
}
