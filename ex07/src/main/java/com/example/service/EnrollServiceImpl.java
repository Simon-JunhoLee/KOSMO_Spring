package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.CouDAO;
import com.example.dao.EnrollDAO;
import com.example.domain.EnrollVO;

@Service
public class EnrollServiceImpl implements EnrollService {
	@Autowired
	EnrollDAO dao;
	
	@Autowired
	CouDAO cdao;

	@Transactional
	@Override
	public int insert(EnrollVO vo) {
		// TODO Auto-generated method stub
		int check = dao.check(vo);
		if(check == 0) {
			dao.insert(vo);
			cdao.updatePersons(vo.getLcode(), 1);
		}
		return check;
	}

	@Override
	public void delete(EnrollVO vo) {
		// TODO Auto-generated method stub
		dao.delete(vo);
		cdao.updatePersons(vo.getLcode(), -1);
	}
}
