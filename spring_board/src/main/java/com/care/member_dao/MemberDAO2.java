package com.care.member_dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.care.member_dto.MemberDTO;
import com.care.member_dto.MemberDTO2;
import com.care.template.Constant;

public class MemberDAO2 {
	private JdbcTemplate template;
	
	public MemberDAO2() {
		this.template = Constant.template;
	}
	
	public ArrayList<MemberDTO2> list2() {
		String sql = "select * from mvc_board";
		ArrayList<MemberDTO2> list2 = null;
		try {
			list2 = (ArrayList<MemberDTO2>)template.query(sql, 
					new BeanPropertyRowMapper<MemberDTO2>(MemberDTO2.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list2;
	}
	
	public void write_save(final String name,final String title,final String content) {
		String sql =  "insert into mvc_board(id,name,title,content,hit,idgroup,step,indent)"
				+"values( mvc_board_seq.nextval,?,?,?,0,mvc_board_seq.currval,0,0)";
		template.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, name);
				ps.setString(2, title);
				ps.setString(3, content);
			}
			
		});
	}
	public MemberDTO2 check_modify(int id) {
		String sql = "select * from member02 where id='"+id+"'";
		MemberDTO2 dto2 = null;
		try {
			dto2 = (MemberDTO2) template.query(sql, 
					new BeanPropertyRowMapper<MemberDTO2>(MemberDTO2.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto2;
	}
}
