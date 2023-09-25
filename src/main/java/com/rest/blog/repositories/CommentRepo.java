package com.rest.blog.repositories;

import com.rest.blog.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author nawaz
 */
public interface CommentRepo  extends JpaRepository<Comment, Integer> {

}
