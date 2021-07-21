package com.dio.projetoSpring;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoSpringApplication {


	public static void main(String[] args) {
		Logger logger = LogManager.getLogger(ProjetoSpringApplication.class);
		logger.debug("teste");
		SpringApplication.run(ProjetoSpringApplication.class, args);

	}

}
