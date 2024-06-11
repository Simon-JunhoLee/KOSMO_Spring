package com.example.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.domain.BBSVO;
import com.example.domain.QueryVO;

@Repository
public class BBSDAOImpl  implements BBSDAO{
	@Autowired
	SqlSession session;
	String namespace = "com.example.mapper.BBSMapper";
	
	@Override
	public List<HashMap<String, Object>> list(QueryVO vo) {
		// TODO Auto-generated method stub
		return session.selectList(namespace + ".list", vo);
	}

	@Override
	public int total(QueryVO vo) {
		// TODO Auto-generated method stub
		return session.selectOne(namespace + ".total", vo);
	}

	@Override
	public BBSVO read(int bid) {
		// TODO Auto-generated method stub
		return session.selectOne(namespace + ".read", bid);
	}

	@Override
	public void delete(int bid) {
		// TODO Auto-generated method stub
		session.delete(namespace + ".delete", bid);
	}

	@Override
	public void update(BBSVO vo) {
		// TODO Auto-generated method stub
		session.update(namespace + ".update", vo);
	}

	@Override
	public void insert(BBSVO vo) {
		// TODO Auto-generated method stub
		session.insert(namespace + ".insert", vo);
	}

}
