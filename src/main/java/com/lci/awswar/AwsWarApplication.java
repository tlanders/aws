package com.lci.awswar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsWarApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsWarApplication.class, args);
	}

	@RequestMapping("/")
	public String hello() {
		return "<h1>Hello World!</h1>";
	}
}
