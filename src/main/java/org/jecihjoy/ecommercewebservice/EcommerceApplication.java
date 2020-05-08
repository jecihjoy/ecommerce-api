package org.jecihjoy.ecommercewebservice;

import org.jecihjoy.ecommercewebservice.Dao.ProductDao;
import org.jecihjoy.ecommercewebservice.Models.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUsername("root");
		dataSource.setPassword("jess@2020");
		dataSource.setUrl(
				"jdbc:mysql://localhost:3306/ecommerce?createDatabaseIfNotExist=true");

		return dataSource;
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
