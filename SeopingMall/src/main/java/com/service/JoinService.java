package com.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.mapper.JoinMapper;
import com.vo.JoinVO;

@Service
public class JoinService {
	
	@Autowired
	private JoinMapper mapper;
	
	
	// ȸ������ ��ư
	public void signUp(JoinVO vo) {
		System.out.println("param=>"+vo.toString());
		mapper.signUp(vo);
	}
	
	//�α��� ��ư
	public void getLoginCheck(JoinVO vo) {
		System.out.println("param=>"+vo.toString());
		mapper.getLoginCheck(vo);
	}

	

}
