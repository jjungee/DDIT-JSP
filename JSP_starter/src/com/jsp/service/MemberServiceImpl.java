package com.jsp.service;

import java.sql.SQLException;
import java.util.List;

import com.jsp.dao.MemberDao;
import com.jsp.dao.MemberDaoImpl;
import com.jsp.dto.MemberVO;

public class MemberServiceImpl implements MemberService {
	private MemberDao dao;
	private static MemberService service;
	
	public MemberServiceImpl() {
		dao = MemberDaoImpl.getInstance();
	}
	
	public static MemberService getInstance() {
		if(service == null) service = new MemberServiceImpl();
		
		return service;
	}

	@Override
	public MemberVO login(String id) throws SQLException {
		MemberVO member = dao.login(id);
		
		return id.equals(member.getId()) ? member : null;
	}

	@Override
	public int regist(MemberVO member) throws SQLException {
		return dao.regist(member);
	}

	@Override
	public List<MemberVO> memberList() throws SQLException {
		return dao.memberList();
	}
}
