package com.redis.invoice.common;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class InvoiceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 7428051251365675318L; 
	
	public InvoiceNotFoundException(String message) {
		super(message);
	}
}
