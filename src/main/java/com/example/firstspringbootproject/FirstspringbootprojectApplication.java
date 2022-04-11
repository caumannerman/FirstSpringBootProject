package com.example.firstspringbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // JPA Auditing 활성화 
@SpringBootApplication // 스프링부트 자동설정,
public class FirstspringbootprojectApplication {

	//SpringApplication.run으로 인해 스프링부트가 내장 WAS( Web App Server)를 실행함
	public static void main(String[] args) {
		SpringApplication.run(FirstspringbootprojectApplication.class, args);
	}

}
