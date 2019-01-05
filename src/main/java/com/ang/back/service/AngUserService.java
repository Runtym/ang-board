package com.ang.back.service;

import java.util.List;

import com.ang.back.vo.AngUser;

public interface AngUserService {
	public AngUser login(AngUser au);
	public List<AngUser> selectUserList();
}
