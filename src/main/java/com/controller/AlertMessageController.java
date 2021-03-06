package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.AlertMessage;
import com.service.AlertMessageService;

@RestController
public class AlertMessageController {
	
	@Autowired
	AlertMessageService alertMessageService;
	
	@RequestMapping(method=RequestMethod.GET,value="/getAlertMessageList/{displaymsg}")
	public List<AlertMessage> getAlertMessageList(@PathVariable String displaymsg){
		return this.alertMessageService.getAlertMessageList(displaymsg);
	}

}
