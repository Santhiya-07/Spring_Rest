package com.capg.exception;

public class IdNotFoundException extends Exception {
	private String msg;

	public IdNotFoundException(String msg) {
		super(msg);
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}
	

}
