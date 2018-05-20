package com._520it._02_tx.service;

public interface IAccountService {

	//转账操作
	void trans(Long inId,Long outId,Double money);
}
