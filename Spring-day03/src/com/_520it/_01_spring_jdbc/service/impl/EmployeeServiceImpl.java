package com._520it._01_spring_jdbc.service.impl;

import java.util.List;

import lombok.Setter;

import com._520it._01_spring_jdbc.dao.IEmployeeDAO;
import com._520it._01_spring_jdbc.domain.Employee;
import com._520it._01_spring_jdbc.service.IEmployeeService;


public class EmployeeServiceImpl implements IEmployeeService {

	@Setter
	private IEmployeeDAO employeeDAO ;
	@Override
	public void save(Employee e) {

		employeeDAO.save(e);
	}

	@Override
	public Employee get(Long id) {
		return employeeDAO.get(id);
	}

	@Override
	public List<Employee> list() {
		return employeeDAO.list();
	}

}
