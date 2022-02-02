package com.example.springboot_products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootProductsApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(SpringBootProductsApplication.class, args);
    }

}
