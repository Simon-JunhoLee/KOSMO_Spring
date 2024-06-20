package com.example.dao;

import java.util.List;

import com.example.domain.ProVO;
import com.example.domain.QueryVO;

public interface ProDAO {
	public List<ProVO> list(QueryVO vo);
	public int total();
}
