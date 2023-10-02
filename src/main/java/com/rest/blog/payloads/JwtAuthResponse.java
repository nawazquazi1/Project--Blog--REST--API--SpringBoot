package com.rest.blog.payloads;

import lombok.Data;
import lombok.ToString;

/**
 * @author nawaz
 */
@Data
@ToString
public class JwtAuthResponse {

	private String token;
	
	private UserDto user;
}
