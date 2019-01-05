package com.ang.back.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ang.back.config.JWTFactory;
import com.ang.back.service.AngUserService;
import com.ang.back.vo.AngUser;

@RestController
public class AngUserController {
	private static final Logger logger = LoggerFactory.getLogger(AngUserController.class);
	@Autowired
	private AngUserService aus;
	@Autowired
	private JWTFactory jwtf;
	
	@PostMapping("/api/login")
	public AngUser login(@RequestBody AngUser au,HttpSession session) {
		logger.info("session id=>{}",session.getId());
		au = aus.login(au);
		if(au!=null) {
			au.setToken(jwtf.generateJWT(au.getId()));
		}
		return au;
	}
	@GetMapping("/api/users")
	public List<AngUser> getUserList(){
		return aus.selectUserList();
	}
}
