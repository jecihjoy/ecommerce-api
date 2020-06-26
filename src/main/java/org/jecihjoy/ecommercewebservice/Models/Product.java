package org.jecihjoy.ecommercewebservice.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table( name = "products")
@Setter @Getter @NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long productId;
    String product_name;
    @Lob
    String product_description;
    double price;
    double company_price;
    @Column(name = "quantity")
    int quantity = 1;
    String imageOne;
    String imageTwo;
    String imageThree;
    String imageFour;

    public Product(String product_name, String product_description, double price, double company_price, String imageOne, String imageTwo, String imageThree, String imageFour) {
        this.product_name = product_name;
        this.product_description = product_description;
        this.price = price;
        this.company_price = company_price;
        this.imageOne = imageOne;
        this.imageTwo = imageTwo;
        this.imageThree = imageThree;
        this.imageFour = imageFour;
    }
}
