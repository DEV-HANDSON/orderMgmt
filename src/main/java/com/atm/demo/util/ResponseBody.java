package com.atm.demo.util;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class ResponseBody implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5387870807297273854L;
	Map<String, List<?>> response;
}
