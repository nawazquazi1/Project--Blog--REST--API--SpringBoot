package com.rest.blog.repositories;
import com.rest.blog.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo  extends JpaRepository<Role, Integer>{

}
