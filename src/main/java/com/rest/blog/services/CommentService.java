package com.rest.blog.services;


import com.rest.blog.payloads.CommentDto;
/**
 * @author nawaz
 */
public interface CommentService {

	CommentDto createComment(CommentDto commentDto, Integer postId);

	void deleteComment(Integer commentId);

}
