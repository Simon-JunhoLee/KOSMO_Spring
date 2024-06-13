package com.example.dao;

import java.util.HashMap;
import java.util.List;

import com.example.domain.QueryVO;
import com.example.domain.ReplyVO;

public interface ReplyDAO {
	public void insert(ReplyVO vo);
	public List<HashMap<String, Object>> list(int bid, QueryVO vo);
	public ReplyVO read(int rid);
	public int total(int bid);
	public void update(ReplyVO vo);
	public void delete(int rid);
}
