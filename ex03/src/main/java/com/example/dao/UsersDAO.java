package com.example.dao;

import java.util.HashMap;
import java.util.List;

import com.example.domain.QueryVO;
import com.example.domain.UsersVO;

public interface UsersDAO {
	public List<HashMap<String,Object>> list();
	public UsersVO read(String uid);
	public void insert(UsersVO vo);
	public void update(UsersVO vo);
	public void delete(String uid);
	public List<HashMap<String,Object>> plist(QueryVO vo);
	public List<HashMap<String,Object>> slist(QueryVO vo);
	public int total();
	public int total(QueryVO vo);
}
