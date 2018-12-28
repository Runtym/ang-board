package com.ang.back.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ang.back.dao.AngBoardDAO;
import com.ang.back.service.AngBoardService;
import com.ang.back.vo.AngBoard;

@Service
public class AngBoardServiceImpl implements AngBoardService {

	@Autowired
	private AngBoardDAO abdao;
	@Override
	public List<AngBoard> selectAngBoardList() {
		// TODO Auto-generated method stub
		return abdao.selectAngBoardList();
	}

}
