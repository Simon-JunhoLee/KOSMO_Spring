package com.example.dao;

import java.util.List;

import com.example.domain.UsersVO;

public interface UserDAO {
	public List<UsersVO> list();
	public UsersVO read(String uid);
	public void update(UsersVO vo);
	public void updatePhoto(String photo, String uid);
	public void updatePass(String upass, String uid);
	public void updatePoint(String uid, int amount);
}
