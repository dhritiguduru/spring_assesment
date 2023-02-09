package com.q2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.q2.entity.Author;
import com.q2.repository.AuthorRepository;
import com.q2.service.AuthorService;

@RestController
public class AuthorController {
	@Autowired
	AuthorService authService;

	@GetMapping("/author")

	public List<Author> getAll() {
		List<Author> author = authService.getAll();
		System.out.println("Author retrieved " + author.size());
		return author;
	}

	@GetMapping("author/{id}")
	public Author add(@PathVariable("id") Integer id) {
		Optional<Author> a = authService.get(id);
		return a.get();
	}

	@PostMapping("author")
	public Author add(@org.springframework.web.bind.annotation.RequestBody Author author) {
		return authService.update(author);
	}

	@PutMapping("author")
	public Author edit(@org.springframework.web.bind.annotation.RequestBody Author author) {
		return authService.update(author);
	}
	/*
	 * @org.springframework.web.bind.annotation.DeleteMapping("author") public
	 * String delete(@org.springframework.web.bind.annotation.RequestParam(value =
	 * "id") Integer id) { Optional<Author> b = authService.get(id);
	 * authService.delete(b.get()); return "Author ID "+ id+
	 * " deleted successfully"; }
	 */

}
