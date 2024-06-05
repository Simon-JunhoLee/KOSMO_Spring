package com.example.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	SqlSession session;
	String namespace = "com.example.mapper.UserMapper";
	
	@Override
	public List<HashMap<String, Object>> list() {
		// TODO Auto-generated method stub
		return session.selectList(namespace + ".list");
	}

	@Override
	public HashMap<String, Object> read(String uid) {
		// TODO Auto-generated method stub
		return session.selectOne(namespace + ".read", uid);
	}

}
