package com.george.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeRestExceptionHandler {

	
	//Add am exception handler for EmployeeNotFoundException
	
	
	@ExceptionHandler
	public ResponseEntity<EmployeeErrorResponse> handleException(EmployeeNotFoundException exc){
		
		//create employee error response
		EmployeeErrorResponse error = new EmployeeErrorResponse(
											HttpStatus.BAD_REQUEST.value(),
											exc.getMessage(),
											System.currentTimeMillis());
		
		//return ResponseEntity
		
	
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
	
	
	//Add another exception handler...to catch all the exceptions
	
	
}
