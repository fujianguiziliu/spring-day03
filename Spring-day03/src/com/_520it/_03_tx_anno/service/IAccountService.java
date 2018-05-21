package com._520it._03_tx_anno.service;

public interface IAccountService {

	//转账操作
	void trans(Long inId,Long outId,Double money);
	
	//转入操作
		void transin(Long inId,Double money);
		
	//转出操作
	void transout(Long outId,Double money);
}
