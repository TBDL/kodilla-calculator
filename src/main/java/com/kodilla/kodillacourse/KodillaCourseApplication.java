package com.kodilla.kodillacourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCourseApplication {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        double result = calculator.sumAandB(5.5, 1.4);

        System.out.println(result);
    }
}
