package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@GetMapping("/list")
	public String list() {
		return "board/list";
	}
	
	@GetMapping("/form")
	public String form() {
		return "board/form";
	}
}
