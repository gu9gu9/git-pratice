package com.mycompany.springframework.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ch01Controller {
	@GetMapping("/ch01/content")
	public String content() {
		log.info("실행");		
		return "ch01/content";
	}
	
}
