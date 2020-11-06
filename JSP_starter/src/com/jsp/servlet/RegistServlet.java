package com.jsp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.MemberVO;
import com.jsp.service.MemberService;
import com.jsp.service.MemberServiceImpl;

/**
 * Servlet implementation class RegistServlet
 */
@WebServlet("/regist")
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/WEB-INF/views/common/registForm.jsp";
				
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/WEB-INF/views/common/regist_success.jsp";
		
		request.setCharacterEncoding("utf-8");
		
		String message = null;
		
		MemberService service = new MemberServiceImpl();
		
		try {
			MemberVO member = new MemberVO();
			
			String id = request.getParameter("id").trim();
			String pwd = request.getParameter("pwd").trim();
			String name = request.getParameter("name").trim();
			String email = request.getParameter("email").trim();
			String phone = request.getParameter("phone").trim();
			
			member.setId(id);
			member.setPwd(pwd);
			member.setName(name);
			member.setEmail(email);
			member.setPhone(phone);
			
			int cnt = service.regist(member);
			
			if(cnt > 0){
				message = member.getName() + "환영합니다";
				
				request.setAttribute("id", id);
				request.setAttribute("pwd", pwd);
				request.setAttribute("name", name);
				request.setAttribute("email", email);
				request.setAttribute("phone", phone);
				
			}else {
				url = "/WEB-INF/views/common/login_fail.jsp";
				message="가입 실패..";
				
			}
			request.setAttribute("message", message);
		} catch (Exception e) {
		}
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}
