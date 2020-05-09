package org.jecihjoy.ecommercewebservice.Service;

import org.jecihjoy.ecommercewebservice.Dao.ProductDao;
import org.jecihjoy.ecommercewebservice.Models.Product;
import org.jecihjoy.ecommercewebservice.Service.impl.ProductServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
public class ProductServiceImplTest {

    @TestConfiguration
    static class ProductServiceImplTestContextConfiguration {

        @Bean
        public ProductService productService() {
            return new ProductServiceImpl();
        }
    }

    @Autowired
    private ProductService productService;

    @MockBean
    private ProductDao productDao;

    @Test
    public void shouldGetProductById() {
        Product product = new Product("Bag", "black bag pack", 3000.0, 3200.0, null, null, null,null);
        product.setProductId((long) 1);

        when(productDao.findById((long) 1)).thenReturn(Optional.of(product));

        Optional<Product> result = productService.getProductById((long)1);
        assertThat(result.isPresent(), is(true));
        assertThat(result.get().getProductId(), equalTo(product.getProductId()));
    }

    @Test
    public void shouldGetAllProducts() {
        Collection<Product> products = new ArrayList<>();
        Product product = new Product("Bag", "black bag pack", 3000.0, 3200.0, null, null, null,null);
        products.add(product);

        when(productDao.findAll()).thenReturn((List<Product>) products);
        Collection<Product> result = productService.getAllProducts();
        assertThat(result.isEmpty(), equalTo(false));
        assertThat(result.size(), greaterThanOrEqualTo(1));
        assertThat(result.iterator().next().getProduct_name(), equalTo("Bag"));
    }
}
