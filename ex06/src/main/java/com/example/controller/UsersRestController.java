package com.example.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.example.dao.UserDAO;
import com.example.domain.UsersVO;

@RestController
@RequestMapping("/users")
public class UsersRestController {
	@Autowired
	UserDAO dao;
	
	@GetMapping("")
	public List<UsersVO> list(){
		return dao.list();
	}
	
	@GetMapping("/{uid}")	// 테스트 : /users/jun
	public UsersVO read(@PathVariable("uid") String uid) {
		return dao.read(uid);
	}
	
	@PostMapping("/update")
	public void update(UsersVO vo) {
		dao.update(vo);
	}
	
	@PostMapping("/photo/{uid}")
	public void photo(@PathVariable("uid") String uid, MultipartHttpServletRequest multi) throws IllegalStateException, IOException {
		// 파일을 폴더(Storage)에 업로드
		MultipartFile file = multi.getFile("file");
		if(!file.isEmpty()) {
			String filePath = "/upload/photo/";
			String fileName = System.currentTimeMillis() + ".jpg";
			file.transferTo(new File("c:" + filePath + fileName));
			dao.updatePhoto(filePath + fileName, uid);
		}
	}
	
	@PostMapping("/update/pass")
	public void pass( @RequestBody UsersVO vo) {
		dao.updatePass(vo.getUpass(), vo.getUid());
	}
	
}
