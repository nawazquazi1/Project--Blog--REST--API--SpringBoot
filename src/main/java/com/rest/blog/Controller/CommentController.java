package com.rest.blog.Controller;

import com.rest.blog.payloads.ApiResponse;
import com.rest.blog.payloads.CommentDto;
import com.rest.blog.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author nawaz
 */
@RestController
@RequestMapping("/api/v1/")
public class CommentController {

	@Autowired
	private CommentService commentService;

	@PostMapping("/post/{postId}/comments")
	public ResponseEntity<CommentDto> createComment(@RequestBody CommentDto comment, @PathVariable Integer postId) {

		CommentDto createComment = this.commentService.createComment(comment, postId);
		return new ResponseEntity<>(createComment, HttpStatus.CREATED);
	}

	@DeleteMapping("/comments/{commentId}")
	public ResponseEntity<ApiResponse> deleteComment(@PathVariable Integer commentId) {

		this.commentService.deleteComment(commentId);

		return new ResponseEntity<>(new ApiResponse("Comment deleted successfully !!", true), HttpStatus.OK);
	}

}
