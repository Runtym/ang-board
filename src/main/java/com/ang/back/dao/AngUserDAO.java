package com.ang.back.dao;

import java.util.List;

import com.ang.back.vo.AngUser;

public interface AngUserDAO {

	public AngUser selectUser(AngUser au);
	public List<AngUser> selectUserList();
}
