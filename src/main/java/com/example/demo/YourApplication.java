package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("пакет.с.компонентами")
public class YourApplication {
	public static void main(String[] args) {
		SpringApplication.run(YourApplication.class, args);
	}
}
