package org.jecihjoy.ecommercewebservice.RestControllers;

import org.jecihjoy.ecommercewebservice.Models.Product;
import org.jecihjoy.ecommercewebservice.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("all")
    public Collection<Product> getAllProducts(){
        return productService.getAllProducts();
    }
}
