package com.innovez.sample.core.repository;

import com.innovez.sample.core.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zakyalvan
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
