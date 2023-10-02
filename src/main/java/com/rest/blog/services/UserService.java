package com.rest.blog.services;

import com.rest.blog.payloads.UserDto;

import java.util.List;
/**
 * @author nawaz
 */
public interface UserService {

	UserDto registerNewUser(UserDto user);
	
	
	UserDto createUser(UserDto user);

	UserDto updateUser(UserDto user, int userId);

	UserDto getUserById(int userId);

	List<UserDto> getAllUsers();

	void deleteUser(int userId);

}
