package ru.netology.test_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(TestServiceApplication.class, args);
        System.out.println("Alles in Ordnung!");
    }

}
