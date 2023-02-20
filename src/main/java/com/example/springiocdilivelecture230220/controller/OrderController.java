package com.example.springiocdilivelecture230220.controller;

import com.example.springiocdilivelecture230220.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(@Qualifier("pizza") OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/order/{foodName}/{amount}" )
    public String order(@PathVariable String foodName, @PathVariable int amount) {
        return this.orderService.order(foodName, amount);
    }

}
