package com.wsz.demo2;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wsz.demo2.service.AccountService;

/**
 * 
 * @author wsz
 * @date 2018年2月27日
 */
@SuppressWarnings("restriction")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("resource/spring2.xml")
public class SpringDemo2 {
   
	/**
	 * 需要使用代理类
	 */
	@Resource(name="accountServiceProxy")
	private AccountService accountService;
	
	@Test
	public void demo1() {
		accountService.transfer("aa", "bb", 200D);
	}
}
