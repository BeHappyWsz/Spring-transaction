package com.wsz.demo3.base;

import javax.sql.DataSource;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
/**
 * 基础dao类
 * @author wsz
 * @date 2018年2月28日
 */
public class BaseDao extends JdbcDaoSupport {
	
	public BaseDao() {
	}
	
	/**
	 * 注入dataSource
	 * @param dataSource
	 */
	public BaseDao(DataSource dataSource) {
		super.setDataSource(dataSource);
	}
}
