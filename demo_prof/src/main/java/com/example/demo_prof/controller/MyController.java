package com.example.demo_prof.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class MyController {

	@RequestMapping("/")
	public String root() {
		return "main";
	}
	
	@RequestMapping("/list")
	public String getList() {
		return "list";
	}
	
	@RequestMapping("/writeForm")
	public String writeForm() {
		return "writeForm";
	}
	
	@RequestMapping("/write")
	public String write() {
		return "redirect:list";
	}
	
	@RequestMapping("/detail")
	public String detail() {
		return "detail";
	}
	
	@RequestMapping("/delete")
	public String delete() {
		return "redirect:list";
	}
}
