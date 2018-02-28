package com.wsz.demo3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wsz.demo3.service.AccountService;

/**
 * 
 * @author wsz
 * @date 2018年2月27日
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("resource/spring3.xml")
public class SpringDemo3 {
   
	@Autowired
	private AccountService accountService;
	
	@Test
	public void demo1() {
		accountService.transfer("aa", "bb", 200D);
	}
}
