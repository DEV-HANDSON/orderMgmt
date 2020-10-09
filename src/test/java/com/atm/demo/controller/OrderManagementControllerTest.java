package com.atm.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import com.atm.demo.entities.CustomerOrder;
import com.atm.demo.service.OrderService;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
public class OrderManagementControllerTest {

	@InjectMocks
	private OrderManagementController orderManagementController;

	@Mock
	private RequestAttributes attributes;

	@Mock
	private OrderService orderService;

	private MockMvc mockMvc;

	@Before
	private void setUp() {
		RequestContextHolder.setRequestAttributes(attributes);
		this.mockMvc = MockMvcBuilders.standaloneSetup(orderManagementController).build();
	}



     @Test
	public void testgetOrders() {
        
		List<CustomerOrder> list = new ArrayList<>();
		Mockito.when(orderService.getOrders()).thenReturn(list);
		Assert.assertNotNull(orderManagementController.getOrders());
	    Assert.assertNotNull(list);
		
	}

	/*@PostMapping("/saveOrders")
	public ResponseEntity<Void> saveEmployees(@RequestBody CustomerOrder order) {
		HttpHeaders header = new HttpHeaders();
		orderService.saveOrder(order);
		header.add("desc", "save order");
		return ResponseEntity.status(HttpStatus.OK).headers(header).build();
	}
	*/

}
