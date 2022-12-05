package com.group3.insuranceSystem;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
class PolicyAddressEntityTest {
	@Autowired
	private WebApplicationContext webApplicationContext;
	MockMvc mvc; // 創建MockMvc類的物件

	@BeforeEach
	public void setup() {
		mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void contextLoads() throws Exception {
		String uri = "/api/policies";
		MvcResult result = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON)).andReturn();
		int status = result.getResponse().getStatus();
		Assert.assertEquals("error status", 200, status);
	}
}
