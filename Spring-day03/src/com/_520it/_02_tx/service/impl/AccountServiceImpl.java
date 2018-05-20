package com._520it._02_tx.service.impl;

import lombok.Setter;

import com._520it._02_tx.dao.IAccountDAO;
import com._520it._02_tx.service.IAccountService;

public class AccountServiceImpl implements IAccountService {

	@Setter
	private IAccountDAO accountDAO;
	@Override
	public void trans(Long inId, Long outId, Double money) {

		accountDAO.transin(inId, money);
		System.out.println(1/0);
		accountDAO.transout(outId, money);
		
	}

}
