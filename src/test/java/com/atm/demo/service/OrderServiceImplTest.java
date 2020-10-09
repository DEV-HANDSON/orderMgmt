package com.atm.demo.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.atm.demo.entities.CustomerOrder;
import com.atm.demo.repository.CustomerOrderRepository;


public class OrderServiceImplTest  {
	
	
	@InjectMocks
	private OrderServiceImpl orderServiceImpl;
	
	@Mock
	private CustomerOrderRepository customerOrderRepository;
	
	@Test
	public void testgetOrders() {		
		List<CustomerOrder> customerOrders= new ArrayList<>();
		customerOrders.add(new CustomerOrder("12323","sb","test","test1", "ddw"));
		doReturn(customerOrders).when(customerOrderRepository).findAll();
		List<CustomerOrder> result= customerOrderRepository.findAll();
		assertEquals(customerOrders, result);
	}

	
	
}
