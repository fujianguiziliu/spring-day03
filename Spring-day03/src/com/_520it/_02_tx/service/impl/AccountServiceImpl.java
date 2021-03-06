package com._520it._02_tx.service.impl;

import lombok.Setter;

import com._520it._02_tx.dao.IAccountDAO;
import com._520it._02_tx.service.IAccountService;

public class AccountServiceImpl implements IAccountService {

	@Setter
	private IAccountDAO accountDAO;
	@Override
	public void trans(Long inId, Long outId, Double money) {

		transin(inId, money);
		System.out.println(1/0);
		transout(outId, money);
		
	}
	@Override
	public void transin(Long inId, Double money) {
		this.accountDAO.transin(inId, money);
	}
	@Override
	public void transout(Long outId, Double money) {
		this.accountDAO.transout(outId, money);
	}

}
