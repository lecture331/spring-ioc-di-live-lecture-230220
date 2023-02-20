package com.example.springiocdilivelecture230220;

import org.junit.jupiter.api.Test;

public class Injection {
    // 필드 주입
    @Test
    void fieldInjection() {
        Consumer consumer = new Consumer();
        consumer.food = new Chicken();
        consumer.eat();

        consumer.food = new Pizza();
        consumer.eat();
    }

    // 메서드 주입
    @Test
    void methodInjection() {
        Consumer consumer = new Consumer();
        consumer.setFood(new Chicken());
        consumer.eat();
    }

    // 생성자 주입
    @Test
    void constructorInjection() {
        Consumer consumer = new Consumer(new Pizza());
        consumer.eat();
    }



    class Consumer {

        Food food;

        public Consumer(){}

        public Consumer(Food food) {
            this.food = food;
        }

        public void setFood(Food food) {
            this.food = food;
        }

        public void eat() {
            this.food.eat();
        }
    }

    class Chicken implements Food {
        @Override
        public void eat() {
            System.out.println("치킨을 먹는다.");
        }
    }

    class Pizza implements Food {
        @Override
        public void eat() {
            System.out.println("피자를 먹는다.");
        }
    }

    interface Food {
        void eat();
    }
}
