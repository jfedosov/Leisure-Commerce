package com.fishingstore.ecommerce.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "customer_type", schema = "public", catalog = "LeCommerce")
public class CustomerType {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    
    @Column(name = "customer_type")
    private String customerType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerType that = (CustomerType) o;
        return id == that.id && Objects.equals(customerType, that.customerType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerType);
    }
}
