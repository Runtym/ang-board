package com.ang.back.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class AngFileController {

	@PostMapping("/api/files")
	public int fileUpload(@RequestParam MultipartFile file) {
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		return 1;
    }
}
