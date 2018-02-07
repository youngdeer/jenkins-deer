package com.deer.jenkinsdeer;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author youngdeer
 * springboot project run class
 */
@SpringBootApplication
@RestController
public class JenkinsDeerApplication extends SpringBootServletInitializer{
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(JenkinsDeerApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDeerApplication.class, args);
	}
	
	@RequestMapping("/hellodeer")
	public String hellodeer(@RequestParam String name) {
		return "hi deer,i am "+name;
	}
	
	@RequestMapping("/cayla")
	public String cayla() {
		Map<String , Object> map = returnnull();
		map.get("xx");
		return "cayla i love you";
	}
	
	private Map<String , Object> returnnull(){
		return null;
	}
}
