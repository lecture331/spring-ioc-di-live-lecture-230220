package com.example.springiocdilivelecture230220;

import org.junit.jupiter.api.Test;

public class LooseCoupling {
    @Test
    void main() {
        Consumer consumer = new Consumer();
        consumer.eat(new Chicken());
        consumer.eat(new Pizza());
    }

    class Consumer {
            public void eat(Food food) {
            food.eat();
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
