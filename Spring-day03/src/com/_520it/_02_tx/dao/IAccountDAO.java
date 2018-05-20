package com._520it._02_tx.dao;

public interface IAccountDAO {

	//转入操作
	void transin(Long inId,Double money);
	
	//转出操作
	void transout(Long outId,Double money);
}
