package com._520it._03_tx_anno.dao.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com._520it._02_tx.dao.IAccountDAO;
@Repository

public class AccountDAOImpl  implements IAccountDAO {

	private JdbcTemplate template;
	
	@Autowired
	public void setDataSource(DataSource ds){
		this.template=new JdbcTemplate(ds);
	}
	@Override
	public void transin(Long inId, Double money) {
		template.update("update account set balance=balance+? where id=?",money,inId);
		
	}

	@Override
	public void transout(Long outId, Double money) {
		template.update("update account set balance=balance-? where id=?",money,outId);

	}

}
