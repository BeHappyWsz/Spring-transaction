package com.wsz.spring_transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.wsz.spring_transaction.base.BaseService;
import com.wsz.spring_transaction.dao.AccountDao;

@Service
public class AccountServiceImpl extends BaseService implements AccountService{
	
	@Autowired
	public AccountServiceImpl(TransactionTemplate transactionTemplate) {
		super(transactionTemplate);
	}
	
	@Autowired
	private AccountDao accountDao;
	/**
	 * 转账操作
	 * @param out 转出账号
	 * @param in 转入账号
	 * @param money 转账金额
	 */
	public void transfer(final String out, final String in, final Double money) {
		
		this.getTransactionTemplate().execute(new TransactionCallbackWithoutResult() {
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus paramTransactionStatus) {
				accountDao.outMoney(out, money);
//				int i = 1 / 0;
				accountDao.inMoney(in, money);
			}
		});
	}

}
