package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CouDAO;
import com.example.domain.CouVO;

@Service
public class CouServiceImpl implements CouService {
	@Autowired
	CouDAO dao;

	@Override
	public void insert(CouVO vo) {
		// TODO Auto-generated method stub
		String lcode = dao.getLcode(vo.getDept());
		vo.setLcode(lcode);
		dao.insert(vo);
	}
}
