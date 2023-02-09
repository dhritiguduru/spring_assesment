package com.q2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.q2.entity.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer> {

}
