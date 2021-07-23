package com.dio.projetoSpring;


import com.dio.projetoSpring.controller.TipoDataController;
import com.dio.projetoSpring.model.TipoData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoSpringApplication {


	public static void main(String[] args) {
		//logger
		Logger logger = LogManager.getLogger(ProjetoSpringApplication.class);
		logger.debug("teste");

		SpringApplication.run(ProjetoSpringApplication.class, args);

	}

}
