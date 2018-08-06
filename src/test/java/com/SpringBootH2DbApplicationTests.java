package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.controller.AlertMessageController;
import com.model.AlertMessage;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc

@ActiveProfiles("test")
public class SpringBootH2DbApplicationTests {
	 
	
	@Autowired
	MockMvc mockMvc; 
	
	@InjectMocks 
	AlertMessageController controller;
	@Mock 
	AlertMessage alertMessage;
	 
	@Test 
	public void getAlertMessageList() throws Exception{ 
		 
		  
	}
	 

}
