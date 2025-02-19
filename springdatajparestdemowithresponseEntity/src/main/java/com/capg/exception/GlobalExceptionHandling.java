package com.capg.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class GlobalExceptionHandling {
	@ExceptionHandler(value=InvalidPriceException.class) 
	public ResponseEntity<ErrorResponse> handleExceptionForInvalidPrice(InvalidPriceException e) { 
		ErrorResponse errorResponse=new ErrorResponse();
		errorResponse.setErrorMessage(e.getMsg());
		errorResponse.setDateTime(LocalDateTime.now());
		errorResponse.setStatusCode(HttpStatus.BAD_GATEWAY);
		
		return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.BAD_GATEWAY);
		}
	
	@ExceptionHandler(value=IdNotFoundException.class) 
	public ResponseEntity<ErrorResponse> handleExceptionForIdNotFound(IdNotFoundException e) { 
		ErrorResponse errorResponse=new ErrorResponse();
		errorResponse.setErrorMessage(e.getMsg());
		errorResponse.setDateTime(LocalDateTime.now());
		errorResponse.setStatusCode(HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.NOT_FOUND);
		}

		/*
		 * @ExceptionHandler(value=MethodArgumentNotValidException.class) public String
		 * handleValidation() { return "some validation failed"; }
		 */
	@ExceptionHandler(value=MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String,String>> handleValidation(MethodArgumentNotValidException e) {
		Map<String,String> errors=new HashMap<String, String>();
		for(FieldError error:e.getBindingResult().getFieldErrors()) {
			errors.put(error.getField(), error.getDefaultMessage());
			
		}
		return new ResponseEntity<Map<String,String>>(errors,HttpStatus.BAD_REQUEST);
		}

}
