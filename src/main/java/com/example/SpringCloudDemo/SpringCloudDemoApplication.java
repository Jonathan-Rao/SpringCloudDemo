package com.example.SpringCloudDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudDemoApplication {

	public static void main(String[] args) {
		System.out.println("进来了");
		SpringApplication.run(SpringCloudDemoApplication.class, args);
		System.out.println("进来了");
	}
}
