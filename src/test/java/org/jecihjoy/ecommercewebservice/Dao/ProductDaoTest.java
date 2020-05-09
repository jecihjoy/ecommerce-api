package org.jecihjoy.ecommercewebservice.Dao;

import org.jecihjoy.ecommercewebservice.Models.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;
import java.util.Optional;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ProductDaoTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ProductDao productDao;

    @Test
    public void whenFindById_thenReturnProduct() {
        Product product = new Product("Bag", "black bag pack", 3000.0, 3200.0, null, null, null, null);
        product.setProductId(1L);
        entityManager.merge(product);
        entityManager.flush();

        Optional<Product> result = productDao.findById(1L);
        assertThat(result.isPresent(), is(true));
        assertThat(result.get().getProductId(), equalTo(product.getProductId()));
    }

    @Test
    public void whenFindAll_thenReturnAllProducts() {
        Product product = new Product("Bag", "black bag pack", 3000.0, 3200.0, null, null, null, null);
        product.setProductId(1L);
        entityManager.merge(product);
        entityManager.flush();

        Collection<Product> result = productDao.findAll();
        assertThat(result.isEmpty(), equalTo(false));
        assertThat(result.size(), greaterThanOrEqualTo(1));
        assertThat(result.iterator().next().getProduct_name(), equalTo("Bag"));
    }
}
