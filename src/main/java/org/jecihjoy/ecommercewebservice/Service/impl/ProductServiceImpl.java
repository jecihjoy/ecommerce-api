package org.jecihjoy.ecommercewebservice.Service.impl;

import org.jecihjoy.ecommercewebservice.Dao.ProductDao;
import org.jecihjoy.ecommercewebservice.Models.Product;
import org.jecihjoy.ecommercewebservice.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Collection<Product> getAllProducts() {
        return productDao.findAll();
    }

    @Override
    public Optional<Product> getProducrById(Long id) { return productDao.findById(id);
    }
}
