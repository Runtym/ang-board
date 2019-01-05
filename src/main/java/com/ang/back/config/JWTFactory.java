package com.ang.back.config;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator.Builder;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

@Component
public class JWTFactory {
	private static final String TOKEN_KEY = "dn.fl.wlq";
	
	public String generateJWT(String id) {
		Calendar cal = Calendar.getInstance();
		Date issueDate = cal.getTime();
		cal.add(Calendar.DATE, 10);
		Date expireDate = cal.getTime();
		Builder jwt = JWT.create();
		String tokken = jwt.withIssuedAt(issueDate)
		.withIssuer(id)
		.withExpiresAt(expireDate)
		.sign(Algorithm.HMAC256(TOKEN_KEY));
		return tokken;
	}
	
	public boolean verifyJWT(String id, String tokken) throws Exception {
		JWTVerifier verifier = JWT.require(Algorithm.HMAC256(TOKEN_KEY))
				.withIssuer(id).build();
		DecodedJWT jwt = verifier.verify(tokken);
		System.out.println(jwt.getExpiresAt());
		return true;
	}

	public static void main(String[] args) {
		JWTFactory jf = new JWTFactory();
		//String tokken = jf.generateJWT("test");
		try {
			//System.out.println(tokken);
			System.out.println(jf.verifyJWT("test", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJ0ZXN0IiwiZXhwIjoxNTQ2NTEwMzU1LCJpYXQiOjE1NDY1MDk3NTV9.3FBvDpYwrsKbRf6TVTExuDA67wSzGtDhNPYzlui1QHE"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
