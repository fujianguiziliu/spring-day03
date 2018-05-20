package com._520it._02_tx.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com._520it._02_tx.dao.IAccountDAO;

public class AccountDAOImpl extends JdbcDaoSupport implements IAccountDAO {

	@Override
	public void transin(Long inId, Double money) {
		super.getJdbcTemplate().update("update account set balance=balance+? where id=?",money,inId);
		
	}

	@Override
	public void transout(Long outId, Double money) {
		super.getJdbcTemplate().update("update account set balance=balance-? where id=?",money,outId);

	}

}
