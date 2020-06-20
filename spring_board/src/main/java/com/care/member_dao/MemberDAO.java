package com.care.member_dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.care.member_dto.MemberDTO;
import com.care.template.Constant;

public class MemberDAO {
	private JdbcTemplate template;
	
	public MemberDAO() {
		this.template = Constant.template;
	}
	public ArrayList<MemberDTO> list() {
		String sql = "select * from member02";
		ArrayList<MemberDTO> list = null;
		try {
			list = (ArrayList<MemberDTO>)template.query(sql, 
					new BeanPropertyRowMapper<MemberDTO>(MemberDTO.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public void joinService(final String id, final String pw) {
		String sql = "insert into member02(id,pw) values(?,?)";
		template.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, id);
				ps.setString(2, pw);
			}
		});
	}
	public int check(String id, String pw) {
		//String sql = "select * from member02 where id=?";
		String sql = "select * from member02 where id='"+id+"'";
		MemberDTO dto = null;
		try {
			dto = template.queryForObject(sql, 
					new BeanPropertyRowMapper<MemberDTO>(MemberDTO.class));
			if (dto.getPw().equals(pw)) {
				return 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}
