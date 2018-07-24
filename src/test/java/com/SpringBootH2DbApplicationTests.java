package com;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.core.JsonParser;
import com.model.AlertMessage;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc

public class SpringBootH2DbApplicationTests {
	 
	
	@Autowired
	MockMvc mockMvc; 
	
	@Mock 
	AlertMessage alertMessage;
	 
	@Test 
	public void getAlertMessageList() throws Exception{ 
		
		alertMessage.setMsgId(1l);
		alertMessage.setMsg("Welcome In Spring Boot Application");
		alertMessage.setDisplayMsg("Y");
		this.mockMvc.perform(get("/getAlertMessageList")).andDo(print()).andExpect(status().isOk());
        //.andExpect(content().json("[{\"msgId\":1,\"msg\":\"Welcome In Spring Boot Application\",\"displayMsg\":\"Y\"},{\"msgId\":1,\"msg\":\"Welcome In Spring Boot Application\",\"displayMsg\":\"Y\"}]", false));  
		 
	}

}
