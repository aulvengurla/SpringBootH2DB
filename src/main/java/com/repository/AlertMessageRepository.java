package com.repository;
 

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.AlertMessage;
 
public interface AlertMessageRepository extends JpaRepository<AlertMessage, Long> {
  
	
}
