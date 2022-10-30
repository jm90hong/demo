package com.example.demo.dao;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.User;

@Repository
public class UserDao {
	
	@Autowired
	SqlSession sqlSession;
	
	
	public User getUser(int userIdx) {
		return sqlSession.selectOne("user.getUser",userIdx);
	}
	
}
