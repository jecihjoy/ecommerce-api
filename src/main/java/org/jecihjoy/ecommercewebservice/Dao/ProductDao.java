package org.jecihjoy.ecommercewebservice.Dao;

import org.jecihjoy.ecommercewebservice.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Long> {
}
