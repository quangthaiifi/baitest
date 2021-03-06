/*
 * Created on 2018-10-02 ( Date ISO 2018-10-02 - Time 06:31:38 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.example.demo.controller;

import com.example.demo.entity.Author;
import com.example.demo.service.AuthorService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/authors", produces = "application/hal+json")
public class AuthorController {

	private static final Logger LOGGER = LoggerFactory.getLogger(AuthorController.class);

	private static final String NOT_FOUND ="Author not found";

	@Autowired
	private AuthorService authorService;

	@RequestMapping(value = "/",
			produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Author> findAll() {
		List<Author> list = authorService.findAll();
		return list;
	}


	@GetMapping("{authorId}")
	public Author get(@PathVariable("authorId") Integer authorId) {
		final Author author = authorService.getOne(authorId);
		LOGGER.info("Author found : {}", author);
		return author;
	}

	@PostMapping(value="/create/",consumes = "application/json")
	public Author create(@RequestBody Author author) {
		LOGGER.info("Author creation request : {}", author);
		if (authorService.exist(author)) {
			LOGGER.info("Author already exist ! : {}", author);
			return null;
		} else {
			final Author created = authorService.create(author);
			LOGGER.info("Created author {}", created);
			return created;
		}
	}

	@PutMapping(value="/save/",consumes = "application/json")
	public Boolean update(@RequestBody Author author) {
		return authorService.update(author);
	}

	@DeleteMapping("{authorId}")
	public void delete(@PathVariable("authorId") Integer authorId) {
		LOGGER.info("Author deletion request : {}", resolveIdForLogger(authorId));
		if (authorService.delete(authorId)) {
			LOGGER.info("Author succesfully deleted");
		} else {
			LOGGER.info(NOT_FOUND);
		}
	}

	private String resolveIdForLogger(Integer authorId) {
		final StringBuilder ids = new StringBuilder();
		ids.append(String.valueOf(authorId));
		return ids.toString();
	}

}


