package com.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vo.JoinVO;

@Repository
public class JoinDAO extends SqlSessionDaoSupport{
	
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	public void signUp(JoinVO vo) {
		System.out.println("Sign Up DAO !");
		getSqlSession().insert("JoinDAO.signUp",vo);
		
	}

}
