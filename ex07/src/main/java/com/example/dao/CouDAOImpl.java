package com.example.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.domain.CouVO;
import com.example.domain.QueryVO;

@Repository
public class CouDAOImpl implements CouDAO {
	@Autowired
	SqlSession session;
	String namespace = "com.example.mapper.CouMapper";
	
	@Override
	public List<CouVO> list(QueryVO vo) {
		// TODO Auto-generated method stub
		return session.selectList(namespace + ".list", vo);
	}

	@Override
	public String getLcode(String dept) {
		// TODO Auto-generated method stub
		return session.selectOne(namespace + ".getCode", dept);
	}

	@Override
	public void insert(CouVO vo) {
		// TODO Auto-generated method stub
		session.insert(namespace + ".insert", vo);
	}
	
	@Override
	public CouVO read(String lcode) {
		// TODO Auto-generated method stub
		return session.selectOne(namespace + ".read", lcode);
	}

	@Override
	public void update(CouVO vo) {
		// TODO Auto-generated method stub
		session.update(namespace + ".update", vo);
	}

	@Override
	public void delete(String lcode) {
		// TODO Auto-generated method stub
		session.delete(namespace + ".delete", lcode);
	}

	@Override
	public int total(QueryVO vo) {
		// TODO Auto-generated method stub
		return session.selectOne(namespace + ".total", vo);
	}
	
	@Override
	public void updatePersons(String lcode, int amount) {
		// TODO Auto-generated method stub
		HashMap<String, Object> map = new HashMap<>();
		map.put("lcode", lcode);
		map.put("amount", amount);
		session.update(namespace + ".updatePersons", map);
	}

}
