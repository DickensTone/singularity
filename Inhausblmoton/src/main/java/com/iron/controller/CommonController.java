package com.iron.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Wx")
public class CommonController {

	@GetMapping("/getLogin")
	public String wxLogin() {
		return "hello world";
	}
}
