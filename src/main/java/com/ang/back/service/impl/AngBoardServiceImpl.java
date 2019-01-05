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
	public List<AngBoard> selectAngBoardList(AngBoard ab) {
		return abdao.selectAngBoardList(ab);
	}
	@Override
	public int insertAngBoardList(AngBoard ab) {
		return abdao.insertAngBoardList(ab);
	}
	@Override
	public AngBoard selectAngBoard(Integer num) {
		// TODO Auto-generated method stub
		return abdao.selectAngBoard(num);
	}
	@Override
	public int deleteAngBoardList(List<Integer> list) {
		// TODO Auto-generated method stub
		return abdao.deleteAngBoardList(list);
	}

}
