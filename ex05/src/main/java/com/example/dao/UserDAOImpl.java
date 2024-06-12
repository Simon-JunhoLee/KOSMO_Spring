package com.example.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.domain.UsersVO;

@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	SqlSession session;
	String namespace = "com.example.mapper.UsersMapper";

	@Override
	public UsersVO read(String uid) {
		// TODO Auto-generated method stub
		return session.selectOne(namespace + ".read", uid);
	}

}
