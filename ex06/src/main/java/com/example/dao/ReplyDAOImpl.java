package com.example.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.domain.QueryVO;
import com.example.domain.ReplyVO;

@Repository
public class ReplyDAOImpl implements ReplyDAO {
	@Autowired
	SqlSession session;
	String namespace = "com.example.mapper.ReplyMapper";
	
	@Override
	public void insert(ReplyVO vo) {
		// TODO Auto-generated method stub
		session.insert(namespace + ".insert", vo);
	}

	@Override
	public List<HashMap<String, Object>> list(int bid, QueryVO vo) {
		// TODO Auto-generated method stub
		HashMap<String, Object> map = new HashMap<>();
		map.put("bid", bid);
		map.put("start", vo.getStart());
		map.put("size", vo.getSize());
		return session.selectList(namespace + ".list", map);
	}

	@Override
	public ReplyVO read(int rid) {
		// TODO Auto-generated method stub
		return session.selectOne(namespace + ".read", rid);
	}

	@Override
	public int total(int bid) {
		// TODO Auto-generated method stub
		return session.selectOne(namespace + ".total", bid);
	}
	
	@Override
	public void update(ReplyVO vo) {
		// TODO Auto-generated method stub
		session.update(namespace + ".update", vo);
	}

	@Override
	public void delete(int rid) {
		// TODO Auto-generated method stub
		session.delete(namespace + ".delete", rid);
	}


}
