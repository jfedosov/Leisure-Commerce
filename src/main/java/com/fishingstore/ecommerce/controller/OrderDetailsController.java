package com.fishingstore.ecommerce.controller;

import com.fishingstore.ecommerce.model.OrderDetails;
import com.fishingstore.ecommerce.service.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order-details")
public class OrderDetailsController {

    private final OrderDetailsService orderDetailsService;

    @Autowired
    public OrderDetailsController(OrderDetailsService orderDetailsService) {
        this.orderDetailsService = orderDetailsService;
    }

    @GetMapping
    public List<OrderDetails> getAllOrderDetails() {
        return orderDetailsService.getAllOrderDetails();
    }

    @GetMapping("{id}")
    public OrderDetails getOrderDetailsById(@PathVariable Long id) {
        return orderDetailsService.getOrderDetailsById(id);
    }
}
