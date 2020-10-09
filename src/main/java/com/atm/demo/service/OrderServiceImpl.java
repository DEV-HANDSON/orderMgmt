package com.atm.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
		List<CustomerOrder> orders=	customerOrderRepository.findAll();
		if(CollectionUtils.isEmpty(orders)) {
			return new ArrayList<>();
		}else {
			return orders;
		}
	}

	@Override
	public CustomerOrder saveOrder(CustomerOrder order) {
		return customerOrderRepository.save(order);
	}

	@Override
	public Boolean deleteOrder(String orderId) {
		Optional<CustomerOrder> customerOrder = customerOrderRepository.findByOrderId(orderId);
		if(customerOrder.isPresent()) {
			customerOrderRepository.delete(customerOrder.get());
			return true;
		}else {
			return false;
		}
	
	}

	@Override
	public Optional<CustomerOrder> getOrderById(String orderId) {
		return customerOrderRepository.findByOrderId(orderId);
		
	}

}
