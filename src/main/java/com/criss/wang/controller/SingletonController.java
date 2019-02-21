package com.criss.wang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.criss.wang.service.SingletonService;

@RestController
@Scope("prototype")
public class SingletonController {

	private int index = 0;// 非静态

	@Autowired
	private SingletonService singletonService;

	@Autowired
	private SingletonService singletonService1;

	@RequestMapping("/show")
	public String toShow() {
		System.out.println(++index);
		return "show";
	}

	@RequestMapping("/test")
	public String test() {
		System.out.println(++index);
		return "test";
	}

	@RequestMapping("/test11")
	public String test11() {
		singletonService.test();
		return "test11";
	}

	@RequestMapping("/test12")
	public String test12() {
		singletonService1.toShow();
		return "show";
	}

	@RequestMapping("/test13")
	public String test13() {
		singletonService1.test();
		return "dkf";
	}

}
