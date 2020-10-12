package com.atm.demo.controller;

import com.atm.demo.entities.CustomerOrder;
import com.atm.demo.service.OrderServiceImpl;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.core.OrderComparator;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.RequestAttributes;

import com.atm.demo.service.OrderService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OrderManagementController.class)
@AutoConfigureMockMvc
public class OrderManagementControllerTest {
	@MockBean
	private OrderServiceImpl orderService;

	@Autowired
	private MockMvc mockMvc;


	@Mock
	private RequestAttributes attributes;

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Before
	public void setup(){
		mockMvc= MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}



	public OrderManagementControllerTest(){}


	public void getOrdersTest() throws Exception {
		List<CustomerOrder> list = new ArrayList<>();
		list.add(new CustomerOrder("sd","23","34","34","324"));

		Mockito.when(
				orderService.getOrders()).thenReturn(list);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/orders/getOrders").accept(
				MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		System.out.println(result.getResponse());
		String expected = "{orderId:sd,orderType:23,orderDescription:34,orderDate:34.customerId:324}";

		// {"id":"Course1","name":"Spring","description":"10 Steps, 25 Examples and 10K Students","steps":["Learn Maven","Import Project","First Example","Second Example"]}

		JSONAssert.assertEquals(expected, result.getResponse()
				.getContentAsString(), false);

	}

	

}
