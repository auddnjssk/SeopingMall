package com.mapper;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

import com.vo.JoinVO;

public interface JoinMapper {
	
	public void signUp(JoinVO vo);

	public ArrayList<HashMap<String, String>> getLoginCheck(JoinVO vo);

}
