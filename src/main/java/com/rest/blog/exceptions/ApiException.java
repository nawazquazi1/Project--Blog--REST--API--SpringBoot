package com.rest.blog.exceptions;

/**
 * @author nawaz
 */
public class ApiException extends RuntimeException {

	public ApiException(String message) {
		super(message);

	}

	public ApiException() {
		super();

	}

}
