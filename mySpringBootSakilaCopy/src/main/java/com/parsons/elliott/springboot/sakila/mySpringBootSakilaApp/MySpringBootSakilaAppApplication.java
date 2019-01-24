package com.parsons.elliott.springboot.sakila.mySpringBootSakilaApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.parsons.elliott.springboot.sakila.mySpringBootSakilaController.MySpringBootSakilaAppController;

@EnableJpaAuditing
@SpringBootApplication
public class MySpringBootSakilaAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootSakilaAppApplication.class, args);
	}

}

