package com.atm.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.atm.demo.entities.CustomerOrder;

@Repository
public interface CustomerOrderRepository extends MongoRepository<CustomerOrder, String>{

	  List<CustomerOrder> findAll();
	  Optional<CustomerOrder> findByOrderId(String orderId);
}

