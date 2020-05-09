package org.jecihjoy.ecommercewebservice.RestControllers;

import org.jecihjoy.ecommercewebservice.Dao.ProductDao;
import org.jecihjoy.ecommercewebservice.Models.Product;
import org.jecihjoy.ecommercewebservice.Service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.mockito.BDDMockito.given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;


import java.util.ArrayList;
import java.util.Collection;

@RunWith(SpringRunner.class)
@WebMvcTest(ProductController.class)
public class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductDao productDao;

    @MockBean
    private ProductService productService;

    @Test
    public void whenGetProducts_thenReturnJsonArray() throws Exception {

        Product product = new Product("Bag", "black bag pack", 3000.0, 3200.0, null, null, null, null);
        Collection<Product> products = new ArrayList<>();
        products.add(product);

        given(productService.getAllProducts()).willReturn(products);

        mockMvc.perform(get("/api/product")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].product_name", is(product.getProduct_name())));
    }
}
