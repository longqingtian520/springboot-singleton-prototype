package com.criss.wang.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class SingletonService {
	private int index = 0;// 非静态

	public String toShow() {
		System.out.println(++index);
		return "show";
	}

	public String test() {
		System.out.println(++index);
		return "test";
	}
}
