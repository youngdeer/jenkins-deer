package com.deer.jenkinsdeer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsDeerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDeerApplication.class, args);
	}
	
	@RequestMapping("/hellodeer")
	public String hellodeer(@RequestParam String name) {
		return "hi deer,i am "+name;
	}
	
	@RequestMapping("/cayla")
	public String cayla() {
		return "cayla i love you";
	}
}
