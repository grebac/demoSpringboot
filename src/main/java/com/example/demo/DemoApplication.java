package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.example.demo.database.mongoDB")
@EnableJpaRepositories(basePackages = "com.example.demo.database.mySql")
public class DemoApplication {



    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }

}
