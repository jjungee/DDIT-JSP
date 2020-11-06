package com.jsp.service;

import java.sql.SQLException;
import java.util.List;

import com.jsp.dto.MemberVO;

public interface MemberService {
	public MemberVO login(String id) throws SQLException;
	
	public int regist(MemberVO member) throws SQLException;
	
	public List<MemberVO> memberList() throws SQLException;
}
