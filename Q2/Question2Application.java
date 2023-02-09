package com.q2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.q2.entity.Author;
import com.q2.entity.User;
import com.q2.repository.AuthorRepository;
import com.q2.repository.UserRepository;

@SpringBootApplication
public class Question2Application {
	@Autowired
	private UserRepository repository;

	@Autowired
	private AuthorRepository aRepo;

	public void initUsers() {
		List<Author> employees = Stream.of(new Author(1001, "Dhriti", "U.S.A", 987654),
				new Author(1001, "Priya", "India", 987654), new Author(1001, "Sus", "Canada", 987654))
				.collect(Collectors.toList());
		aRepo.saveAll(employees);

		List<User> users = Stream.of(new User(101, "Dhriti", "Dhriti", "d@gmail.com"),
				new User(102, "user1", "pwd1", "user1@gmail.com"), new User(103, "user2", "pwd2", "user2@gmail.com"),
				new User(104, "user3", "pwd3", "user3@gmail.com")).collect(Collectors.toList());
		repository.saveAll(users);

	}

	public static void main(String[] args) {
		SpringApplication.run(Question2Application.class, args);
	}

}
