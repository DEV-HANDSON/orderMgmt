package com.atm.demo.service;

import java.util.List;

import com.atm.demo.entities.CustomerOrder;


public interface OrderService {

	List<CustomerOrder> getOrders();

	CustomerOrder saveOrder(CustomerOrder order);
   
}
