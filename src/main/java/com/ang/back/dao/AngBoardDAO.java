package com.ang.back.dao;

import java.util.List;

import com.ang.back.vo.AngBoard;

public interface AngBoardDAO {
	public List<AngBoard> selectAngBoardList(AngBoard ab);
	public int insertAngBoardList(AngBoard ab);
	public AngBoard selectAngBoard(Integer num);
}
