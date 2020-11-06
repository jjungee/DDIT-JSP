package com.jsp.dao;

import java.sql.SQLException;
import java.util.List;

import com.config.BuildSqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.jsp.dto.MemberVO;

public class MemberDaoImpl implements MemberDao{
	private static MemberDao dao;
	private SqlMapClient smc;
	
	public MemberDaoImpl() {
		smc = BuildSqlMapClient.getSqlMapClient();
	}
	
	public static MemberDao getInstance(){
		if(dao == null) dao = new MemberDaoImpl();
		
		return dao;
	}
	
	@Override
	public int regist(MemberVO member) throws SQLException {
		int cnt = 0;
		try {
			Object obj = smc.insert("member.memberJoin", member);
			if(obj == null) cnt = 1;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
	
	@Override
	public MemberVO login(String id) throws SQLException {
		MemberVO vo = null;
		try {
			vo = (MemberVO)smc.queryForObject("member.login", id);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return vo;
	}
	
	@Override
	public List<MemberVO> memberList() throws SQLException {
		List<MemberVO> list = null;
		
		try {
			list = smc.queryForList("member.memberList");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
