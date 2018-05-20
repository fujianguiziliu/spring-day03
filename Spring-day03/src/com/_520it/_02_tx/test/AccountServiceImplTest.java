package com._520it._02_tx.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com._520it._02_tx.service.IAccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class AccountServiceImplTest {
	
	@Autowired
	private IAccountService accountService ;
	
	@Test
	public void testTrans() throws Exception {
		accountService.trans(2L, 1l, 1000.0);
	}
}
