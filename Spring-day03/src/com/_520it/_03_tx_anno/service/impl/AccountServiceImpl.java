package com._520it._03_tx_anno.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.Setter;

import com._520it._02_tx.dao.IAccountDAO;
import com._520it._02_tx.service.IAccountService;

@Service
@Transactional
public class AccountServiceImpl implements IAccountService {

	@Autowired
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
