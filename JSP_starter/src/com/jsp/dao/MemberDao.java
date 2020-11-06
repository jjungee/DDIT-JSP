package com.jsp.dao;

import java.sql.SQLException;
import java.util.List;

import com.jsp.dto.MemberVO;

public interface MemberDao {
	public int regist(MemberVO member) throws SQLException;
	
	public MemberVO login(String id) throws SQLException;
	
	public List<MemberVO> memberList() throws SQLException;
}
