package com.wsz.demo3.service;
/**
 * 转账案例业务层接口
 * @author wsz
 * @date 2018年2月27日
 */
public interface AccountService {
	
	/**
	 * 
	 * @param out 转出账号
	 * @param in 转入账号
	 * @param money 转账金额
	 */
	public void transfer(String out,String in,Double money);
}
