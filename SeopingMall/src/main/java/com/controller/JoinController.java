package com.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.JoinService;
import com.vo.JoinVO;


@Controller
public class JoinController {
	
	private static final Logger logger = LoggerFactory.getLogger(JoinController.class);
	
	@Autowired
	private JoinService service;
	
	
	// 진입 !
	@RequestMapping("/member/loginPage")
	public String loginPage() {
		logger.info("loginPage 진입!");
		
		return "/join/login";
	}
	@RequestMapping("/member/signUp")
	public String singUp(HttpServletRequest request) {
		logger.info("회원가입 페이지 진입");
		
		return "/join/signUp";
	}
	
	//  진입~
	
	
	
	@RequestMapping("/member/loginCheck")
	public String login(HttpServletRequest request,JoinVO vo) {
		logger.info("login 시도!");
		vo.setLogin_id(request.getParameter("login_id"));
		vo.setLogin_password(request.getParameter("login_password"));
		
		service.getLoginCheck(vo);
		
		return "/join/login";
	}

	@RequestMapping("/member/signUpReg")
	public String singUpReg(HttpServletRequest request,ModelMap model,JoinVO vo) {
		try {
			
			logger.info("회원가입 정보 입력");
			HttpSession ss = request.getSession();
			
			vo.setUsrId(request.getParameter("usrId"));
			vo.setUsrPassword1(request.getParameter("usrPassword1"));
			vo.setUsrPassword2(request.getParameter("usrPassword1"));
			
			service.signUp(vo);
			
			
			
		} catch (Exception e) {
			logger.info("exception!"+e);
		}
		
		return "/join/login.jsp";
	}
	
	
	
}
