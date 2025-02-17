package com.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
		// Fill the code here
		
		
		return new ResponseEntity<Object>(null, null);
	}

	public final ResponseEntity<ExceptionResponse> handleNotFoundException(RuntimeException ex, WebRequest request) {
		
		// Fill the code here
		
		return null;	
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
		HttpHeaders headers, HttpStatusCode status, WebRequest request) {	
		    
		    // Fill the code here
		    
		return null;
	}
}