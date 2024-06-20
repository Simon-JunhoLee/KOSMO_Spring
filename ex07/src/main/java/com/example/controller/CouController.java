package com.example.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.CouDAO;
import com.example.domain.CouVO;
import com.example.domain.QueryVO;
import com.example.service.CouService;

@RestController
@RequestMapping("/cou")
public class CouController {
	@Autowired
	CouDAO dao;
	
	@Autowired
	CouService service;
	
	@GetMapping("")
	public HashMap<String, Object> list(QueryVO vo) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("total", dao.total(vo));
		map.put("list", dao.list(vo));
		return map;
	}
	
	@PostMapping("/insert")
	public void insert(@RequestBody CouVO vo) {
		service.insert(vo);
	}
	
	@GetMapping("/{lcode}")
	public CouVO read(@PathVariable("lcode") String lcode) {
		return dao.read(lcode);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody CouVO vo) {
		dao.update(vo);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody Map<String, String> request) {
		String lcode = request.get("lcode");
		dao.delete(lcode);
	}
}
