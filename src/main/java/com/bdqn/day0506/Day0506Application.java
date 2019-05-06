package com.bdqn.day0506;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bdqn.day0506.dao")
public class Day0506Application {

    public static void main(String[] args) {
        SpringApplication.run(Day0506Application.class, args);
    }

}
