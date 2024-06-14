package com.example.dao;

import com.example.domain.UsersVO;

public interface UserDAO {
	public UsersVO read(String uid);
	public void update(UsersVO vo);
	public void updatePhoto(String photo, String uid);
	public void updatePass(String upass, String uid);
}
