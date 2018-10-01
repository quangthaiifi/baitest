/*
 * Created on 2018-09-29 ( Date ISO 2018-09-29 - Time 18:43:47 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.example.demo.controller;

import com.example.demo.entity.AmazoneBooks;
import com.example.demo.service.AmazoneBooksServiceImpl;

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
@RequestMapping(value = "/amazoneBooks", produces = "application/hal+json")
public class AmazoneBooksController {

	private static final Logger LOGGER = LoggerFactory.getLogger(AmazoneBooksController.class);

	private static final String NOT_FOUND ="AmazoneBooks not found";

	@Autowired
	private AmazoneBooksService amazoneBooksService;

	@RequestMapping(value = "/",
			produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<AmazoneBooks> findAll() {
		List<AmazoneBooks> list = amazoneBooksService.getAll();
		return list;
	}


	@GetMapping("{isbn}")
	public AmazoneBooks get(@PathVariable("isbn") Long isbn) {
		final AmazoneBooks amazoneBooks = amazoneBooksService.get(isbn);
		LOGGER.info("AmazoneBooks found : {}", amazoneBooks);
		return amazoneBooks;
	}

	@PostMapping(value="/create/",consumes = "application/json")
	public AmazoneBooks create(@RequestBody AmazoneBooks amazoneBooks) {
		LOGGER.info("AmazoneBooks creation request : {}", amazoneBooks);
		if (amazoneBooksService.exist(amazoneBooks)) {
			LOGGER.info("AmazoneBooks already exist ! : {}", amazoneBooks);
			return null;
		} else {
			final AmazoneBooks created = amazoneBooksService.create(amazoneBooks);
			LOGGER.info("Created amazoneBooks {}", created);
			return created;
		}
	}

	@PutMapping(value = "/save/", consumes = "application/json")
	public Boolean update(@RequestBody AmazoneBooks amazoneBooks) {
		return amazoneBooksService.save(amazoneBooks);
	}

	@DeleteMapping("{isbn}")
	public void delete(@PathVariable("isbn") Long isbn) {
		LOGGER.info("AmazoneBooks deletion request : {}", resolveIdForLogger(isbn));
		if (amazoneBooksService.delete(isbn)) {
			LOGGER.info("AmazoneBooks succesfully deleted");
		} else {
			LOGGER.info(NOT_FOUND);
		}
	}

	private String resolveIdForLogger(Long isbn) {
		final StringBuilder ids = new StringBuilder();
		ids.append(String.valueOf(isbn));
		return ids.toString();
	}

}

