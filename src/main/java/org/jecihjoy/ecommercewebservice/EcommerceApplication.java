package org.jecihjoy.ecommercewebservice;

import org.jecihjoy.ecommercewebservice.Dao.ProductDao;
import org.jecihjoy.ecommercewebservice.Models.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ProductDao productDao){
		return args -> {
			Product product = new Product(
					"Bag",
					"black bag pack",
					3000.0,
					3200.0,
					"test1.png",
					"test1.png",
					"test1.png",
					"test1.png");
			productDao.save(product);
			Product product2 = new Product(
					"Bag2",
					"black bag pack",
					3000.0,

					3200.0,
					"test1.png",
					"test1.png",
					"test1.png",
					"test1.png");
			productDao.save(product2);
		};
	}
}
