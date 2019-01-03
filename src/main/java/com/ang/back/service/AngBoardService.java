package com.ang.back.service;

import java.util.List;

import com.ang.back.vo.AngBoard;

public interface AngBoardService {
	public List<AngBoard> selectAngBoardList(AngBoard ab);
	public int insertAngBoardList(AngBoard ab);
	public AngBoard selectAngBoard(Integer num);
}
