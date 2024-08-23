package com.mycompany.springframework.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/ch02")
@Slf4j
public class Ch02Controller {
	private static final Logger logger = LoggerFactory.getLogger(Ch02Controller.class);
	
	@RequestMapping("/getMethod")
	public String getMethod() {	
		log.info("실행");		
		return "ch02/getMethod";		
	}
	@RequestMapping("/postoMethod")
public String postMethod() {	
		logger.info("실행");	
		return "ch02/postMethod";		
	}
	//@RequestMapping(value="/getAtag", method=RequestMethod.POST)
	@GetMapping("/getAtag")
	public String getAtag(String bno, String bkind) {
		log.info("실행");
		log.info("bno:" +bno);
		log.info("bkind: "+bkind);
		return "ch02/getMethod";		
	}
  @GetMapping("/getFormTag")
  public String getFormTag(String bno, String bkind) {
	    log.info("실행");
		log.info("bno:" +bno);
		log.info("bkind: "+bkind);
	  return "ch02/getMethod" ;
  }
}
