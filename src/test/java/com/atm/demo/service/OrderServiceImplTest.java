package com.atm.demo.service;

import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.atm.demo.repository.CustomerOrderRepository;


public class OrderServiceImplTest  {
	
	
	@InjectMocks
	private OrderServiceImpl orderServiceImpl;
	
	@Mock
	private CustomerOrderRepository customerOrderRepository;
	
	
	
	
}
