package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
@Controller
public class MainController {
	
	@RequestMapping("/index")
	public String main() {
		return "index.html";
	}

}
