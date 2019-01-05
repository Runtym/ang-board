package com.ang.back.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ang.back.dao.AngUserDAO;
import com.ang.back.service.AngUserService;
import com.ang.back.vo.AngUser;

@Service
public class AngUserServiceImpl implements AngUserService {

	@Autowired
	private AngUserDAO audao;
	
	@Override
	public AngUser login(AngUser au) {
		AngUser dbAu = audao.selectUser(au);
		if(dbAu==null) {
			return null;
		}
		if(au.getPwd().equals(dbAu.getPwd())) {
			return dbAu;
		}
		return null;
	}

	@Override
	public List<AngUser> selectUserList() {
		return audao.selectUserList();
	}

}
