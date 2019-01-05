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
	public List<AngBoard> selectAngBoardList(AngBoard ab) {
		return ss.selectList("SQL.ANGBOARD.selectAngBoardList",ab);
	}
	@Override
	public int insertAngBoardList(AngBoard ab) {
		return ss.insert("SQL.ANGBOARD.insertAngBoard",ab);
	}
	@Override
	public AngBoard selectAngBoard(Integer num) {
		return ss.selectOne("SQL.ANGBOARD.selectAngBoard",num);
	}
	@Override
	public int deleteAngBoardList(List<Integer> list) {
		return ss.delete("SQL.ANGBOARD.deleteAngBoardList",list);
	}

}
