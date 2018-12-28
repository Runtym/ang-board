package com.ang.back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ang.back.service.AngBoardService;
import com.ang.back.vo.AngBoard;

@RestController
public class AngBoardController {

	@Autowired
	private AngBoardService abs;
	
	@GetMapping("/api/angboard")
	public List<AngBoard> getAngBoardList(){
		return abs.selectAngBoardList();
	}
}
