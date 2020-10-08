package com.atm.demo.util;

import java.io.Serializable;

import org.springframework.stereotype.Component;


import lombok.Data;

@Component
@Data
public class ResponseDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8695958586917379572L;
	
	private ResponseHeader responseHeader;
	
	private ResponseBody responseBody;

	
	
}
