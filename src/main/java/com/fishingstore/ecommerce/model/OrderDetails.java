package com.fishingstore.ecommerce.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "order_details", schema = "public", catalog = "LeCommerce")
public class OrderDetails {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    
    @Column(name = "order_id")
    private int orderId;
    
    @Column(name = "product_id")
    private int productId;
    
    @Column(name = "quantity")
    private int quantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetails that = (OrderDetails) o;
        return id == that.id && orderId == that.orderId && productId == that.productId && quantity == that.quantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderId, productId, quantity);
    }
}
