package com.example.springiocdilivelecture230220;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;

@SpringBootApplication
public class SpringIocDiLiveLecture230220Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringIocDiLiveLecture230220Application.class, args);
    }

    @Resource
    ApplicationContext applicationContext;

    @Bean
    ApplicationRunner applicationRunner() {
        return args -> {
            String[] beanDefinitionNames  =  applicationContext.getBeanDefinitionNames();
            for (String beanDefinitionName : beanDefinitionNames) {
                System.out.println(beanDefinitionName);
            }
        };
    }

}
