package com.kylekprojects.wsidt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("wsidt")
public class WSIDTController {
	@GetMapping("test")
	public String TestMethod() {
		return "Test Message";
	}
}
