package com.rest.blog.payloads;

import lombok.Getter;
import lombok.Setter;

/**
 * @author nawaz
 */
@Setter
@Getter
public class CommentDto {
	
	private int id;

	private String content;

}
