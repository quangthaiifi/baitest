/*
 * Created on 2018-09-29 ( Date ISO 2018-09-29 - Time 18:43:47 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.example.demo.controller;

import com.example.demo.entity.Categories;
import com.example.demo.service.CategoriesServiceImpl;

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
@RequestMapping(value = "/categories", produces = "application/hal+json")
public class CategoriesController {

	private static final Logger LOGGER = LoggerFactory.getLogger(CategoriesController.class);

	private static final String NOT_FOUND ="Categories not found";

	@Autowired
	private CategoriesService categoriesService;

	@RequestMapping(value = "/",
			produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Categories> findAll() {
		List<Categories> list = categoriesService.getAll();
		return list;
	}


	@GetMapping("{categoryId}")
	public Categories get(@PathVariable("categoryId") Long categoryId) {
		final Categories categories = categoriesService.get(categoryId);
		LOGGER.info("Categories found : {}", categories);
		return categories;
	}

	@PostMapping(value="/create/",consumes = "application/json")
	public Categories create(@RequestBody Categories categories) {
		LOGGER.info("Categories creation request : {}", categories);
		if (categoriesService.exist(categories)) {
			LOGGER.info("Categories already exist ! : {}", categories);
			return null;
		} else {
			final Categories created = categoriesService.create(categories);
			LOGGER.info("Created categories {}", created);
			return created;
		}
	}

	@PutMappingvalue = "/save/", consumes = "application/json")
	public Boolean update(@RequestBody Categories categories) {
		return categoriesService.save(categories);
	}

	@DeleteMapping("{categoryId}")
	public void delete(@PathVariable("categoryId") Long categoryId) {
		LOGGER.info("Categories deletion request : {}", resolveIdForLogger(categoryId));
		if (categoriesService.delete(categoryId)) {
			LOGGER.info("Categories succesfully deleted");
		} else {
			LOGGER.info(NOT_FOUND);
		}
	}

	private String resolveIdForLogger(Long categoryId) {
		final StringBuilder ids = new StringBuilder();
		ids.append(String.valueOf(categoryId));
		return ids.toString();
	}

}

