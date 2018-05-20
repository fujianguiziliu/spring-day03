package com._520it._01_spring_jdbc.test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com._520it._01_spring_jdbc.domain.Employee;
import com._520it._01_spring_jdbc.service.IEmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class EmployeeServiceImplTest {

	@Autowired
	private IEmployeeService employeeService;
	
	@Test
	public void testSave() throws Exception {
		Employee e = new Employee();
		e.setName("poa");
		e.setHireDate(new Date());
		e.setSalary(new BigDecimal(55200));
		employeeService.save(e);
	}
	@Test
	public void testGet() throws Exception {
		Employee e = employeeService.get(1L);
		System.out.println(e);
		
	}
	@Test
	public void testList() throws Exception {
	List<Employee> list = employeeService.list();
	for (Employee e : list) {
		System.out.println(e);
	}
		
		
	}
}
