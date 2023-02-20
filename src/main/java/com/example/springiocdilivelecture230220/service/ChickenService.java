package com.example.springiocdilivelecture230220.service;

import com.example.springiocdilivelecture230220.entity.Order;
import com.example.springiocdilivelecture230220.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ChickenService implements OrderService{

    private final int PRICE = 20000;

    private final OrderRepository orderRepository;

    @Autowired
    public ChickenService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public String order(String foodName, int amount) {
        Order order = new Order(foodName, PRICE, amount);
        this.orderRepository.save(order);

        return "치킨 주문 저장 성공";
    }
}
