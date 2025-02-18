package com.exception;

public class InvalidMembershipException extends Exception  {
	private String msg;
	public InvalidMembershipException(String msg) {
		super(msg);
		this.msg=msg;
	}
 
}
