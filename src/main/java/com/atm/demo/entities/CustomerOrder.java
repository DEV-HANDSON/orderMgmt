package com.atm.demo.entities;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "CustomerOrder")
public class CustomerOrder implements Serializable {

	   public CustomerOrder(String orderId, String orderType, String orderDescription, String orderDate,
			String customerId) {
		super();
		this.orderId = orderId;
		this.orderType = orderType;
		this.orderDescription = orderDescription;
		this.orderDate = orderDate;
		this.customerId = customerId;
	}
	public CustomerOrder() {
		// TODO Auto-generated constructor stub
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getOrderDescription() {
		return orderDescription;
	}
	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = -6078902287016745340L;

	@Id
	  private String orderId;

	  private String orderType;
	  private String orderDescription;
	  private String orderDate;
	  private String customerId;
}
