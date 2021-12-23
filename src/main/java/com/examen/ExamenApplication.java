package com.examen;

import com.examen.repository.crud.ProductCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication()
public class ExamenApplication {

	@Autowired
	private ProductCrudRepository prodRepo;

	public static void main(String[] args) {
		SpringApplication.run(ExamenApplication.class, args);
	}

}
