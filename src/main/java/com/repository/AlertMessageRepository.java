package com.repository;
 

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.AlertMessage;
import java.lang.String;
import java.util.List;
 
public interface AlertMessageRepository extends JpaRepository<AlertMessage, Long> {
  
	List<AlertMessage> findByDisplayMsg(String displaymsg);
}
