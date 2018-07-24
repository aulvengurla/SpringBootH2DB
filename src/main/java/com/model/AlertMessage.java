package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AlertMessage {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long msgId;
	private String msg;
	private String displayMsg;

	public AlertMessage() {
		super();
	}

 
	public Long getMsgId() {
		return msgId;
	}


	public void setMsgId(Long msgId) {
		this.msgId = msgId;
	}


	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getDisplayMsg() {
		return displayMsg;
	}

	public void setDisplayMsg(String displayMsg) {
		this.displayMsg = displayMsg;
	}

}
