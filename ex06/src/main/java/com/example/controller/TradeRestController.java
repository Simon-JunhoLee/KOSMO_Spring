package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.TradeVO;
import com.example.service.TradeService;

@RestController
@RequestMapping("/trade")
public class TradeRestController {
	@Autowired
	TradeService service;
	
	@PostMapping("/insert")
	public void insert(@RequestBody TradeVO vo) {
		service.insert(vo);
	}
}
