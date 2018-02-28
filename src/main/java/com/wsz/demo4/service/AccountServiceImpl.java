package com.wsz.demo4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wsz.demo4.dao.AccountDao;
/**
 * spring声明式事务方式:注解
 * @author wsz
 * @date 2018年2月28日
 */
/**
 * propagation	事务传播行为
 * isolation	事务隔离级别
 * readOnly		只读
 * rollbackFor 	发生哪些异常回滚
 * noRollbackFor发生哪些异常不回滚
 *
 */
@Service
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	private AccountDao accountDao;
	
	/**
	 * 转账操作
	 * @param out 转出账号
	 * @param in 转入账号
	 * @param money 转账金额
	 */
	public void transfer(String out,String in,Double money) {
		accountDao.outMoney(out, money);
		int i = 1 / 0;
		accountDao.inMoney(in, money);
	}

}
