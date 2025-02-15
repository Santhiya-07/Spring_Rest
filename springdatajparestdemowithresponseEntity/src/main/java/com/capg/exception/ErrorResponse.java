package com.capg.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class ErrorResponse {
	private String errorMessage;
	private LocalDateTime dateTime;
	private HttpStatus statusCode;
	
	public ErrorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ErrorResponse(String errorMessage, LocalDateTime dateTime, HttpStatus statusCode) {
		super();
		this.errorMessage = errorMessage;
		this.dateTime = dateTime;
		this.statusCode = statusCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public HttpStatus getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(HttpStatus statusCode) {
		this.statusCode = statusCode;
	}
	@Override
	public String toString() {
		return "ErrorResponse [errorMessage=" + errorMessage + ", dateTime=" + dateTime + ", statusCode=" + statusCode
				+ "]";
	}
	
	

}
