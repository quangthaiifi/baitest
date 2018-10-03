/*
 * Created on 2018-10-02 ( Date ISO 2018-10-02 - Time 06:31:38 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.example.demo.controller;

import com.example.demo.entity.BooksHasLibraries;
import com.example.demo.entity.BooksHasLibrariesId;
import com.example.demo.service.BooksHasLibrariesService;

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
@RequestMapping(value = "/booksatlibraries", produces = "application/hal+json")
public class BooksHasLibrariesController {

	private static final Logger LOGGER = LoggerFactory.getLogger(BooksHasLibrariesController.class);

	private static final String NOT_FOUND ="BooksHasLibraries not found";

	@Autowired
	private BooksHasLibrariesService booksHasLibrariesService;

	
	@RequestMapping(value = "/",
			produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<BooksHasLibraries> findAll() {
		List<BooksHasLibraries> list = booksHasLibrariesService.findAll();
		return list;
	}


	@GetMapping("{booksIsbn}/{librariesLibraryId}")
	public BooksHasLibraries get(@PathVariable("booksIsbn") Integer booksIsbn, @PathVariable("librariesLibraryId") Integer librariesLibraryId) {
		BooksHasLibrariesId booksHasLibrariesId = new BooksHasLibrariesId();
		booksHasLibrariesId.setBooksIsbn(booksIsbn);
		booksHasLibrariesId.setLibrariesLibraryId(librariesLibraryId);
		;
		final BooksHasLibraries booksHasLibraries = booksHasLibrariesService.getOne(booksHasLibrariesId);
		LOGGER.info("BooksHasLibraries found : {}", booksHasLibraries);
		return booksHasLibraries;
	}

	@PostMapping(value="/create/",consumes = "application/json")
	public BooksHasLibraries create(@RequestBody BooksHasLibraries booksHasLibraries) {
		LOGGER.info("BooksHasLibraries creation request : {}", booksHasLibraries);
		if (booksHasLibrariesService.exist(booksHasLibraries)) {
			LOGGER.info("BooksHasLibraries already exist ! : {}", booksHasLibraries);
			return null;
		} else {
			final BooksHasLibraries created = booksHasLibrariesService.create(booksHasLibraries);
			LOGGER.info("Created booksHasLibraries {}", created);
			return created;
		}
	}

	@PutMapping(value="/save/",consumes = "application/json")
	public Boolean update(@RequestBody BooksHasLibraries booksHasLibraries) {
		return booksHasLibrariesService.update(booksHasLibraries);
	}

	@DeleteMapping("{booksIsbn}/{librariesLibraryId}")
	public void delete(@PathVariable("booksIsbn") Integer booksIsbn, @PathVariable("librariesLibraryId") Integer librariesLibraryId) {
		LOGGER.info("BooksHasLibraries deletion request : {}", resolveIdForLogger(booksIsbn, librariesLibraryId));
		BooksHasLibrariesId booksHasLibrariesId = new BooksHasLibrariesId();
		booksHasLibrariesId.setBooksIsbn(booksIsbn);
		booksHasLibrariesId.setLibrariesLibraryId(librariesLibraryId);
		
		if (booksHasLibrariesService.delete(booksHasLibrariesId)) {
			LOGGER.info("BooksHasLibraries succesfully deleted");
		} else {
			LOGGER.info(NOT_FOUND);
		}
	}

	private String resolveIdForLogger(Integer booksIsbn, Integer librariesLibraryId) {
		final StringBuilder ids = new StringBuilder();
		ids.append(String.valueOf(booksIsbn));
		ids.append("/");
		ids.append(String.valueOf(librariesLibraryId));
		return ids.toString();
	}

}

