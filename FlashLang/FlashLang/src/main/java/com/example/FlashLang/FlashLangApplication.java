package com.example.FlashLang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FlashLangApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlashLangApplication.class, args);
	}
	
	public String hello(){
		return "Hello World";
	}
}
