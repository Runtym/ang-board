package com.ang.back.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ang.back.service.AngBoardService;
import com.ang.back.vo.AngBoard;

@RestController
public class AngBoardController {
	private static final Logger logger = LoggerFactory.getLogger(AngBoardController.class);
	@Autowired
	private AngBoardService abs;
	
	@GetMapping("/api/angboard")
	public List<AngBoard> getAngBoardList(@ModelAttribute AngBoard ab){
		logger.info("params=>{}",ab);
		return abs.selectAngBoardList(ab);
	}
	@GetMapping("/api/angboard/{num}")
	public AngBoard getAngBoardList(@PathVariable("num") Integer num){
		return abs.selectAngBoard(num);
	}
	@PostMapping("/api/angboard")
	public Map<String,String> insertAngBoard(@RequestBody AngBoard ab) {
		int result = abs.insertAngBoardList(ab);
		Map<String,String> map = new HashMap<>();
		map.put("msg", "성공");
		if(result!=1) {
			map.put("msg", "실패");
		}
		return map;
	}
}
