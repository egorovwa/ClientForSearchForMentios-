package com.example.clientfindnews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients

@SpringBootApplication
public class ClientFindNewsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientFindNewsApplication.class, args);
    }

}
