package com.q2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.q2.entity.Author;
import com.q2.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUserName(String username);

}
