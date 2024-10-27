package com.desi.IetriMangoldtNaranjoPalmier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EntityScan(basePackages = "com.desi.model")
@SpringBootApplication
@EntityScan("model")
@EnableJpaRepositories("com.desi.IetriMangoldtNaranjoPalmier.repository")
public class IetriMangoldtNaranjoPalmierApplication {

	public static void main(String[] args) {
		SpringApplication.run(IetriMangoldtNaranjoPalmierApplication.class, args);
	}

} 
 