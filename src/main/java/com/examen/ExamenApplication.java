package com.examen;

import com.examen.model.Product;
import com.examen.repository.crud.ProductCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.List;

@SpringBootApplication()
public class ExamenApplication implements CommandLineRunner {

	@Autowired
	private ProductCrudRepository prodRepo;

	public static void main(String[] args) {
		SpringApplication.run(ExamenApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		prodRepo.deleteAll();
		prodRepo.saveAll(List.of(
				new Product("123-abc", "1018460767", "JUANA LA LOCA", "CRA 123", "producto de buena calidad", true, 100000, 8, ""),
				new Product("234-abc", "1018460768", "JUANA LA LOCA2", "CRA 1233", "testing buen producto", true, 60000, 5, "")
		));
		System.out.println("Listado de usuarios");
		prodRepo.findAll().forEach(System.out::println);
	}
}
