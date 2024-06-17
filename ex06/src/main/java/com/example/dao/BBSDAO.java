package com.example.dao;

import java.util.HashMap;
import java.util.List;

import com.example.domain.BBSVO;
import com.example.domain.QueryVO;

public interface BBSDAO {
	public List<HashMap<String, Object>> list(QueryVO vo);
	public int total(QueryVO vo);
	public BBSVO read(int bid);
	public void insert(BBSVO vo);
	public void update(BBSVO vo);
	public void delete(int bid);
	public void updateViewCnt(int bid);
	public void updateReplyCnt(int bid, int amount);
}
