package org.jecihjoy.ecommercewebservice.Service;

import org.jecihjoy.ecommercewebservice.Models.Product;

import java.util.Collection;
import java.util.Optional;

public interface ProductService {

    Collection<Product> getAllProducts();

    Optional<Product> getProducrById(Long id);

}
