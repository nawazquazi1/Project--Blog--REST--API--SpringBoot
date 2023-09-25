package com.rest.blog.entities;

import lombok.Data;

import jakarta.persistence.*;

/**
 * @author nawaz
 */
@Entity
@Data
public class Role {

	@Id	
	private int id;
	
	private String name;
	
}
