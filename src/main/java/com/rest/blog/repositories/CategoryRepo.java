package com.rest.blog.repositories;

import com.rest.blog.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author nawaz
 */
public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
