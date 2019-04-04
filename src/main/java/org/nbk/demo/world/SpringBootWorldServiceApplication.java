package org.nbk.demo.world;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
@ComponentScan
public class SpringBootWorldServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWorldServiceApplication.class, args);
	}

}
