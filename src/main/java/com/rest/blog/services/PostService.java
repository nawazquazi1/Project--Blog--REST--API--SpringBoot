package com.rest.blog.services;

import com.rest.blog.payloads.PostDto;
import com.rest.blog.payloads.PostResponse;

import java.util.List;

public interface PostService {

	//create 

	PostDto createPost(PostDto postDto, int userId, int categoryId);

	//update 

	PostDto updatePost(PostDto postDto, int postId);

	// delete

	void deletePost(int postId);
	
	//get all posts
	
	PostResponse getAllPost(int pageNumber, int pageSize, String sortBy, String sortDir);
	
	//get single post
	
	PostDto getPostById(int postId);
	
	//get all posts by category
	
	List<PostDto> getPostsByCategory(int categoryId);
	
	//get all posts by user
	List<PostDto> getPostsByUser(int userId);
	
	//search posts
	List<PostDto> searchPosts(String keyword);

}
