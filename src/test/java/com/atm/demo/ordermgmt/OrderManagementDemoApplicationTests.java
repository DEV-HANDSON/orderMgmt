package com.atm.demo.ordermgmt;

import com.atm.demo.controller.OrderManagementControllerTest;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(Suite.class)
@SpringBootTest
@AutoConfigureMockMvc
@Suite.SuiteClasses({
        OrderManagementControllerTest.class
})
@AutoConfigureWebMvc
class OrderManagementDemoApplicationTests {

    @Test
    void contextLoads() {
    }
    

}
