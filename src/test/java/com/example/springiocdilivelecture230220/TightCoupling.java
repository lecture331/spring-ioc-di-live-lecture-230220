package com.example.springiocdilivelecture230220;

import org.junit.jupiter.api.Test;

public class TightCoupling {

    @Test
    void main() {
        Consumer consumer = new Consumer();
        consumer.eat();
    }

    // 고객이 음식을 주문해서 먹는 상황을 코드로 표현

    class Consumer {
        public void eat() {
//            Chicken chicken = new Chicken();
//            chicken.eat();
            Pizza pizza = new Pizza();
            pizza.eat();
        }
    }

    class Chicken {
        public void eat() {
            System.out.println("치킨을 먹는다.");
        }
    }

    class Pizza {
        public void eat() {
            System.out.println("피자를 먹는다.");
        }
    }

}
