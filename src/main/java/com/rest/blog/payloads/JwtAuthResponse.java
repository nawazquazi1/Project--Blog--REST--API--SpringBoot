package com.rest.blog.payloads;

import lombok.Data;

/**
 * @author nawaz
 */
@Data
public class JwtAuthResponse {

	private String token;
	
	private UserDto user;
}
