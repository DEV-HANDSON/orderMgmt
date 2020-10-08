package com.atm.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.atm.demo.entities.CustomerOrder;
import com.atm.demo.repository.CustomerOrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private CustomerOrderRepository customerOrderRepository;

	@Override
	public List<CustomerOrder> getOrders() {
		com.atm.demo.util.ResponseBody responseBody = new com.atm.demo.util.ResponseBody();
		List<CustomerOrder> orders=	customerOrderRepository.findAll();
		if(CollectionUtils.isEmpty(orders)) {
			return new ArrayList<>();
		}else {
			return orders;
		}
	}

	@Override
	public CustomerOrder saveOrder(CustomerOrder order) {
		
		return null;
	}

}
