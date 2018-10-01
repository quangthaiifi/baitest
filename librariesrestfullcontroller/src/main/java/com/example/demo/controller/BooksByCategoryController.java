/*
 * Created on 2018-09-29 ( Date ISO 2018-09-29 - Time 18:43:47 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.example.demo.controller;

import com.example.demo.entity.BooksByCategory;
import com.example.demo.service.BooksByCategoryServiceImpl;

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
@RequestMapping(value = "/booksByCategory", produces = "application/hal+json")
public class BooksByCategoryController {

	private static final Logger LOGGER = LoggerFactory.getLogger(BooksByCategoryController.class);

	private static final String NOT_FOUND ="BooksByCategory not found";

	@Autowired
	private BooksByCategoryServiceImpl booksByCategoryService;

	@RequestMapping(value = "/",
			produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<BooksByCategory> findAll() {
		List<BooksByCategory> list = booksByCategoryService.getAll();
		return list;
	}


	@GetMapping("{booksByCategoryid}")
	public BooksByCategory get(@PathVariable("booksByCategoryid") Long booksByCategoryid) {
		final BooksByCategory booksByCategory = booksByCategoryService.get(booksByCategoryid);
		LOGGER.info("BooksByCategory found : {}", booksByCategory);
		return booksByCategory;
	}

	@PostMapping(consumes = "application/json")
	public BooksByCategory create(@RequestBody BooksByCategory booksByCategory) {
		LOGGER.info("BooksByCategory creation request : {}", booksByCategory);
		if (booksByCategoryService.exist(booksByCategory)) {
			LOGGER.info("BooksByCategory already exist ! : {}", booksByCategory);
			return null;
		} else {
			final BooksByCategory created = booksByCategoryService.create(booksByCategory);
			LOGGER.info("Created booksByCategory {}", created);
			return created;
		}
	}

	@PutMapping(value = "{booksByCategoryid}", consumes = "application/json")
	public Boolean update(@PathVariable("booksByCategoryid") Long booksByCategoryid, @RequestBody BooksByCategory booksByCategory) {
		return booksByCategoryService.save(booksByCategory);
	}

	@DeleteMapping("{booksByCategoryid}")
	public void delete(@PathVariable("booksByCategoryid") Long booksByCategoryid) {
		LOGGER.info("BooksByCategory deletion request : {}", resolveIdForLogger(booksByCategoryid));
		if (booksByCategoryService.delete(booksByCategoryid)) {
			LOGGER.info("BooksByCategory succesfully deleted");
		} else {
			LOGGER.info(NOT_FOUND);
		}
	}

	private String resolveIdForLogger(Long booksByCategoryid) {
		final StringBuilder ids = new StringBuilder();
		ids.append(String.valueOf(booksByCategoryid));
		return ids.toString();
	}

}
