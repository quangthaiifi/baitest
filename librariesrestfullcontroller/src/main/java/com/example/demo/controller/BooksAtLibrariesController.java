/*
 * Created on 2018-09-29 ( Date ISO 2018-09-29 - Time 18:43:47 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.example.demo.controller;

import com.example.demo.entity.BooksAtLibraries;
import com.example.demo.service.BooksAtLibrariesServiceImpl;

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
@RequestMapping(value = "/booksAtLibraries", produces = "application/hal+json")
public class BooksAtLibrariesController {

	private static final Logger LOGGER = LoggerFactory.getLogger(BooksAtLibrariesController.class);

	private static final String NOT_FOUND ="BooksAtLibraries not found";

	@Autowired
	private BooksAtLibrariesService booksAtLibrariesService;

	@RequestMapping(value = "/",
			produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<BooksAtLibraries> findAll() {
		List<BooksAtLibraries> list = booksAtLibrariesService.getAll();
		return list;
	}


	@GetMapping("{booksHasLibrariesid}")
	public BooksAtLibraries get(@PathVariable("booksHasLibrariesid") Long booksHasLibrariesid) {
		final BooksAtLibraries booksAtLibraries = booksAtLibrariesService.get(booksHasLibrariesid);
		LOGGER.info("BooksAtLibraries found : {}", booksAtLibraries);
		return booksAtLibraries;
	}

	@PostMapping(value="/create/",consumes = "application/json")
	public BooksAtLibraries create(@RequestBody BooksAtLibraries booksAtLibraries) {
		LOGGER.info("BooksAtLibraries creation request : {}", booksAtLibraries);
		if (booksAtLibrariesService.exist(booksAtLibraries)) {
			LOGGER.info("BooksAtLibraries already exist ! : {}", booksAtLibraries);
			return null;
		} else {
			final BooksAtLibraries created = booksAtLibrariesService.create(booksAtLibraries);
			LOGGER.info("Created booksAtLibraries {}", created);
			return created;
		}
	}

	@PutMapping(value = "/save/",value = "{booksHasLibrariesid}", consumes = "application/json")
	public Boolean update(@RequestBody BooksAtLibraries booksAtLibraries) {
		return booksAtLibrariesService.save(booksAtLibraries);
	}

	@DeleteMapping("{booksHasLibrariesid}")
	public void delete(@PathVariable("booksHasLibrariesid") Long booksHasLibrariesid) {
		LOGGER.info("BooksAtLibraries deletion request : {}", resolveIdForLogger(booksHasLibrariesid));
		if (booksAtLibrariesService.delete(booksHasLibrariesid)) {
			LOGGER.info("BooksAtLibraries succesfully deleted");
		} else {
			LOGGER.info(NOT_FOUND);
		}
	}

	private String resolveIdForLogger(Long booksHasLibrariesid) {
		final StringBuilder ids = new StringBuilder();
		ids.append(String.valueOf(booksHasLibrariesid));
		return ids.toString();
	}

}

