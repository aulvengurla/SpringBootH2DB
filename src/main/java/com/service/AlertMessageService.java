package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.AlertMessage;
import com.repository.AlertMessageRepository;

@Service
public class AlertMessageService {
	
	@Autowired
	AlertMessageRepository alertMessageRepository;

	public List<AlertMessage> getAlertMessageList() { 
		return this.alertMessageRepository.findAll();
	}

	
}
