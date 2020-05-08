package org.jecihjoy.ecommercewebservice.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table( name = "products")
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

    public Product() {
    }

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

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCompany_price() {
        return company_price;
    }

    public void setCompany_price(double company_price) {
        this.company_price = company_price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getImageOne() {
        return imageOne;
    }

    public void setImageOne(String imageOne) {
        this.imageOne = imageOne;
    }

    public String getImageTwo() {
        return imageTwo;
    }

    public void setImageTwo(String imageTwo) {
        this.imageTwo = imageTwo;
    }

    public String getImageThree() {
        return imageThree;
    }

    public void setImageThree(String imageThree) {
        this.imageThree = imageThree;
    }

    public String getImageFour() {
        return imageFour;
    }

    public void setImageFour(String imageFour) {
        this.imageFour = imageFour;
    }
}
