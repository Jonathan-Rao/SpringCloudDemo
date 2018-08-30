package com.example.SpringCloudDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class SpringCloudDemoApplication {

	public static void main(String[] args) {
		System.out.println("进来了");
		SpringApplication.run(SpringCloudDemoApplication.class, args);
		System.out.println("进来了");  
	}
}
