package com.irshu.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class JmsConsumerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmsConsumerAppApplication.class, args);
	}

}
