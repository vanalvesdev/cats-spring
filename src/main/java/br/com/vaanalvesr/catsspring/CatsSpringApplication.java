package br.com.vaanalvesr.catsspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CatsSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatsSpringApplication.class, args);
	}

}
