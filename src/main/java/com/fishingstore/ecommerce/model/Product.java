package com.fishingstore.ecommerce.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Product {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_description")
    private String productDescription;

    @Column(name = "product_price")
    private Integer productPrice;

    @Column(name = "product_image")
    private String productImage;

    @Column(name = "manufacturer_id")
    private int manufacturerId;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category categoryId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public int getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(int manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public Category getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Category categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && categoryId == product.categoryId && manufacturerId == product.manufacturerId && Objects.equals(productName, product.productName) && Objects.equals(productDescription, product.productDescription) && Objects.equals(productPrice, product.productPrice) && Objects.equals(productImage, product.productImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productName, productDescription, productPrice, productImage, categoryId, manufacturerId);
    }
}
