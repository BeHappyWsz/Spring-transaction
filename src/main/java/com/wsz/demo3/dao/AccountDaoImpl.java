package com.wsz.demo3.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wsz.demo3.base.BaseDao;

@Repository
public class AccountDaoImpl extends BaseDao implements AccountDao{

	@Autowired
	public AccountDaoImpl(DataSource dataSource) {
		super(dataSource);
	}

	public void outMoney(String out, Double money) {
		String sql = "update account set money = money - ? where name =?";
		this.getJdbcTemplate().update(sql,money,out);
	}

	/**
	 * 表结构
	 * id 主键
	 * name varchar
	 * money double
	 */
	public void inMoney(String in, Double money) {
		String sql = "update account set money = money + ? where name =?";
		this.getJdbcTemplate().update(sql,money,in);
	}

}
