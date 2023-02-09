package com.q2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.q2.entity.Author;
import com.q2.repository.AuthorRepository;

@Service
public class AuthorService {

	@Autowired
	AuthorRepository aRepo;

	public List<Author> getAll() {
		// TODO Auto-generated method stub
		return (List<Author>) aRepo.findAll();
	}

	public Optional<Author> get(Integer id) {
		// TODO Auto-generated method stub
		return aRepo.findById(id);
	}

	public Author update(Author author) {
		// TODO Auto-generated method stub
		return aRepo.save(author);
	}

}
