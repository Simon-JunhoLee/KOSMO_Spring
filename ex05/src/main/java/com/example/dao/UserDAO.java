package com.example.dao;

import com.example.domain.UsersVO;

public interface UserDAO {
	public UsersVO read(String uid);
}
