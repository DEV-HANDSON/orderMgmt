package com.atm.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/get-order/{orderId}")
	public ResponseEntity<CustomerOrder> getOrdersbyId(@PathVariable("orderId") String orderId) {
		HttpHeaders header = new HttpHeaders();
		header.add("desc", "order list");
		Optional<CustomerOrder> customerOrder = orderService.getOrderById(orderId);
		if(customerOrder.isPresent())
		return ResponseEntity.status(HttpStatus.OK).headers(header).body(customerOrder.get());
		else
			return ResponseEntity.status(HttpStatus.OK).headers(header).body(null);
	}

	@PostMapping("/saveOrders")
	public ResponseEntity<Void> saveOrders(@RequestBody CustomerOrder order) {
		HttpHeaders header = new HttpHeaders();
		header.add("desc", "save order");
		orderService.saveOrder(order);
		return ResponseEntity.status(HttpStatus.OK).headers(header).build();
	}
	
	@PostMapping("/updateOrders")
	public ResponseEntity<Void> updateOrders(@RequestBody CustomerOrder order) {
		HttpHeaders header = new HttpHeaders();
		header.add("desc", "update order");
		orderService.saveOrder(order);
		return ResponseEntity.status(HttpStatus.OK).headers(header).build();
	}

	@DeleteMapping("/deleteOrder/{orderId}")
	public ResponseEntity<Void> deleteEmployees(@PathVariable("orderId") String orderId) {
		HttpHeaders header = new HttpHeaders();
		header.add("desc", "delete order");
		orderService.deleteOrder(orderId);
		return ResponseEntity.status(HttpStatus.OK).headers(header).build();

	}

}
