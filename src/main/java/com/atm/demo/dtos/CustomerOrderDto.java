package com.atm.demo.dtos;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class CustomerOrderDto implements Serializable {

	   /**
	 * 
	 */
	private static final long serialVersionUID = 3255981292411110274L;

	@Id
	  private String orderId;

	  private String orderType;
	  private String orderDescription;
	  private String orderDate;
	  private String customerId;
}
