package com.rest.blog.payloads;

import lombok.Data;

/**
 * @author nawaz
 */
@Data
public class JwtAuthRequest {

	private String username;
	
	private String password;
	
}
