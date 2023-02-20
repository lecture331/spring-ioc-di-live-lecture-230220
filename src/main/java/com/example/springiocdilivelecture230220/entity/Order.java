package com.example.springiocdilivelecture230220.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Entity(name = "orders")
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String foodName;
    private int price;
    private int amount;

    public Order(String foodName, int price, int amount) {
        this.foodName = foodName;
        this.price = price;
        this.amount = amount;
    }
}
