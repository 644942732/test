package com.example.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class InitService {

	@Autowired
	private Service service;

	private String info;

	public void handler(String info) {

		switch (info) {
		case "1":
			service.sign();
			break;

		case "2":
			service.list();
			break;
		case "3":
			service.count();
			break;

		default:
			System.out.println("请输入合法的数字！");
			info = new Scanner(System.in).nextLine();
			handler(info);
		}
	}

	@Bean
	public CommandLineRunner runner() {

		return args -> {
			while (true) {
				System.out.println("请选择一下你要进行的操作>>>>>>");
				System.out.println("1.签到");
				System.out.println("2.查询");
				System.out.println("3.统计");

				info = new Scanner(System.in).nextLine();
				handler(info);
			}

		};

	}

}
