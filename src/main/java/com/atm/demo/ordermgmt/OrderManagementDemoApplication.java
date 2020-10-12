package com.atm.demo.ordermgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.atm.demo.repository.CustomerOrderRepository;

@SpringBootApplication(scanBasePackages = { "com.atm.demo.controller",
		"com.atm.demo.service", "com.atm.demo.repository","com.atm.demo.entities","com.atm.demo.util"})
@EnableMongoRepositories(basePackageClasses = CustomerOrderRepository.class)
public class OrderManagementDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderManagementDemoApplication.class, args);
    }

}
