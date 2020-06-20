package com.care.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.care.dto.BankDTO;

public class BankDAO {
	private JdbcTemplate template;
	private TransactionTemplate transactionTemplate;
	
	public void setTransactionTemplate(TransactionTemplate t) {
		this.transactionTemplate = t;
	}
	
	public BankDAO(JdbcTemplate template) {
		this.template = template;
	}
	
	public int[] depositMoney(BankDTO dto) {
		String sql_user = "update myaccount set money=money+? where num=1";
		String sql_system = "update sysaccount set money=money+? where num=1";
		String sql_balance = "update balance set totmoney=totmoney+? where num=1";
		int arr[] = new int[3];
		try {
			transactionTemplate.execute(new TransactionCallbackWithoutResult() {

				@Override
				protected void doInTransactionWithoutResult(TransactionStatus status) {
					arr[0] = template.update(sql_user,ps->{
						ps.setInt(1, dto.getMoney());
					});
					arr[1] = template.update(sql_system,ps->{
						ps.setInt(1, dto.getMoney());
					});
					arr[2] = template.update(sql_balance,ps->{
						ps.setInt(1, dto.getMoney());
					});
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return arr;
	}
	
	public BankDTO balanceMoney() {
		String sql_balance = "select * from balance where num=1";
		BankDTO dto = null;
		dto = template.queryForObject(sql_balance, new BeanPropertyRowMapper<BankDTO>(BankDTO.class));
		return dto;
	}
}
