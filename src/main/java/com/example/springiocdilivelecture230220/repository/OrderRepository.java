package com.example.springiocdilivelecture230220.repository;

import com.example.springiocdilivelecture230220.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
