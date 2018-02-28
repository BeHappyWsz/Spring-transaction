package com.wsz.spring_transaction.base;

import org.springframework.transaction.support.TransactionTemplate;
/**
 * 基础service类
 * @author wsz
 * @date 2018年2月28日
 */
public class BaseService {

	private TransactionTemplate transactionTemplate;

	public BaseService(TransactionTemplate transactionTemplate) {
		this.transactionTemplate=transactionTemplate;
	}
	
	public TransactionTemplate getTransactionTemplate() {
		return transactionTemplate;
	}
}
