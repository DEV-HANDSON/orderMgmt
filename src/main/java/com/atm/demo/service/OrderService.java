package com.atm.demo.service;

import java.util.List;
import java.util.Optional;

import com.atm.demo.entities.CustomerOrder;


public interface OrderService {

	List<CustomerOrder> getOrders();

	CustomerOrder saveOrder(CustomerOrder order);

	Boolean deleteOrder(String orderId);

	Optional<CustomerOrder> getOrderById(String orderId);
   
}
