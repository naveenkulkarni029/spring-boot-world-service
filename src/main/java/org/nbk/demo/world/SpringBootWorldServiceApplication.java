package org.nbk.demo.world;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SpringBootWorldServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWorldServiceApplication.class, args);
	}

}
