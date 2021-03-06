package com.jsp.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.MemberVO;
import com.jsp.service.MemberService;
import com.jsp.service.MemberServiceImpl;

/**
 * Servlet implementation class MemberDeteilServlet
 */
@WebServlet("/member/detail")
public class MemberDeteilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/WEB-INF/views/member/detail.jsp";
		
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		
		MemberService service = new MemberServiceImpl();
		
		try {
			MemberVO member = service.login(id);
			
			request.setAttribute("member", member);
		} catch (Exception e) {
		}
		
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
