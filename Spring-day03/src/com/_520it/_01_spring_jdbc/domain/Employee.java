package com._520it._01_spring_jdbc.domain;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class Employee {

	private Long id;
	private String name;
	private BigDecimal salary;
	private Date hireDate;
}
