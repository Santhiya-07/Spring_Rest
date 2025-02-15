package com.capg.exception;

public class InvalidPriceException extends Exception {
	String msg;

	public InvalidPriceException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	

}
