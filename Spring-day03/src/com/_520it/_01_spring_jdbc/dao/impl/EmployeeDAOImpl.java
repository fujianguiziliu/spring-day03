package com._520it._01_spring_jdbc.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com._520it._01_spring_jdbc.dao.IEmployeeDAO;
import com._520it._01_spring_jdbc.domain.Employee;

public class EmployeeDAOImpl extends JdbcDaoSupport implements IEmployeeDAO {

	
	private JdbcTemplate template;
	
	//通过DI将连接池注入进来，然后再使用它来创建模板对象
	/*public void setDataSource(DataSource ds){
	template = new JdbcTemplate(ds);
	}*/
	@Override
	public void save(Employee e) {
		super.getJdbcTemplate().update("insert into t_employee(name,salary,hiredate) values(?,?,?)",
				e.getName(),e.getSalary(),e.getHireDate());
		
	}

	@Override
	public Employee get(Long id) {
		List<Employee> list =super.getJdbcTemplate().query("select * from t_employee where id=?",  
				new RowMapper<Employee>(){

					@Override
					public Employee mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						Employee e = new Employee();
						e.setId(rs.getLong("id"));
						e.setName(rs.getString("name"));
						e.setSalary(rs.getBigDecimal("salary"));
						e.setHireDate(rs.getDate("hiredate"));
						return e;
					}
				},id);
		return list.size() == 1? list.get(0) :null;
		
	}

	@Override
	public List<Employee> list() {
		List<Employee> list= super.getJdbcTemplate().query("select * from t_employee",
				new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum)
					throws SQLException {
				Employee e = new Employee();
				e.setId(rs.getLong("id"));
				e.setName(rs.getString("name"));
				e.setSalary(rs.getBigDecimal("salary"));
				e.setHireDate(rs.getDate("hiredate"));
				return e;
			}
		});
		return list;
		
		
	
	}

}
