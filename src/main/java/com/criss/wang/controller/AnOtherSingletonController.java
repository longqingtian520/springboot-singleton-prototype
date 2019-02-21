package com.criss.wang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.criss.wang.service.SingletonService;

@RestController
public class AnOtherSingletonController {

	@Autowired
	private SingletonService singletonService1;

	@RequestMapping("/test21")
	public String test12() {
		singletonService1.toShow();
		return "show21";
	}

	@RequestMapping("/test22")
	public String test13() {
		singletonService1.test();
		return "dkf22";
	}
}
