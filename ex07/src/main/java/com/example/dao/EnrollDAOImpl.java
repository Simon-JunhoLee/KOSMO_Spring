package com.example.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.domain.EnrollVO;

@Repository
public class EnrollDAOImpl implements EnrollDAO {
	@Autowired
	SqlSession session;
	String namespace = "com.example.mapper.EnrollMapper";
	
	@Override
	public List<HashMap<String, Object>> lcodeList(String lcode) {
		// TODO Auto-generated method stub
		return session.selectList(namespace + ".lcodeList", lcode);
	}
	
	@Override
	public List<HashMap<String, Object>> scodeList(String scode) {
		// TODO Auto-generated method stub
		return session.selectList(namespace + ".scodeList", scode);
	}

	@Override
	public int check(EnrollVO vo) {
		// TODO Auto-generated method stub
		return session.selectOne(namespace + ".check", vo);
	}

	@Override
	public void insert(EnrollVO vo) {
		// TODO Auto-generated method stub
		session.insert(namespace + ".insert", vo);
	}

	@Override
	public void updateGrade(EnrollVO vo) {
		// TODO Auto-generated method stub
		session.update(namespace + ".updateGrade", vo);
	}
	
	@Override
	public void delete(EnrollVO vo) {
		// TODO Auto-generated method stub
		session.delete(namespace + ".delete", vo);
	}

}
