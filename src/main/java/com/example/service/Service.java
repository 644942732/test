package com.example.service;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Service {

	private List<String> list;

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public void sign() {
		System.out.println("请输入您的姓名！>>>");
		String name = new Scanner(System.in).nextLine();
		list.add(name);
		System.out.println(name + "签到成功");
	}

	public void list() {
		System.out.println("已签到的用户如下>>>>>>>>>>>");
//		去重
		List<String> list2 = list.stream().distinct().collect(Collectors.toList());
		System.out.println(list2);
	}

	public void count() {
//		根据姓名分组统计签到次数
		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(String::toString, Collectors.counting()));
		
		System.out.println("共有" + map.size() + "人签到");
		System.out.println("本月每人的签到次数如下");
		System.out.println(map);
	}
}
