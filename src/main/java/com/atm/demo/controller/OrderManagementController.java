package com.atm.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atm.demo.entities.CustomerOrder;
import com.atm.demo.service.OrderService;

@RestController
@RequestMapping("/orders")

public class OrderManagementController {

	@Autowired
	private OrderService orderService;

	@GetMapping("/getOrders")
	public ResponseEntity<List<CustomerOrder>> getOrders() {
		HttpHeaders header = new HttpHeaders();
		header.add("desc", "order list");
		List<CustomerOrder> list = orderService.getOrders();
		return ResponseEntity.status(HttpStatus.OK).headers(header).body(list);
	}

	@PostMapping("/saveOrders")
	public ResponseEntity<Void> saveEmployees(@RequestBody CustomerOrder order) {
		HttpHeaders header = new HttpHeaders();
		 orderService.saveOrder(order);
		header.add("desc", "save order");
		return ResponseEntity.status(HttpStatus.OK).headers(header).build();
	}

}
