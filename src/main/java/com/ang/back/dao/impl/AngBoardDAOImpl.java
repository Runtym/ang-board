package com.ang.back.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ang.back.dao.AngBoardDAO;
import com.ang.back.vo.AngBoard;

@Repository
public class AngBoardDAOImpl implements AngBoardDAO {

	@Autowired
	private SqlSession ss;
	@Override
	public List<AngBoard> selectAngBoardList() {
		// TODO Auto-generated method stub
		return ss.selectList("SQL.ANGBOARD.selectAngBoardList");
	}

}
