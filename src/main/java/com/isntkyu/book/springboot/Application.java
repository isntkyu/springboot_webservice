package com.isntkyu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@EnableJpaAuditing
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
         try {
             SpringApplication.run(Application.class, args);
         } catch (Exception e)
         {
             e.printStackTrace();
         }
    }
}