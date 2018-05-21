package com._520it._03_tx_anno.dao;

public interface IAccountDAO {

	//转入操作
	void transin(Long inId,Double money);
	
	//转出操作
	void transout(Long outId,Double money);
}
