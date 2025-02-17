package com.exception;

public class InvalidModuleException extends Exception {
	String msg;
    public InvalidModuleException(String msg) {
    	super(msg);
    	this.msg=msg;
    	
		
	}
}
