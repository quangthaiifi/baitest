/*
 * Created on 2018-09-28 ( Date ISO 2018-09-28 - Time 09:53:16 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.example.demo.service;

import com.example.demo.entity.BooksByCategory;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service interface for BooksByCategory.
 * @author Telosys (http://www.telosys.org/) version 3.0.0
 */
public interface BooksByCategoryService {

	/**
	 * Perform a pageable and filtered search.
	 * @param pageable pagination configuration
	 * @return a page of booksByCategory
	 */
	public Page<BooksByCategory> search(Pageable pageable);
	/**
	 * Recover an booksByCategory following an id.
	 * @param id the given id
	 * @return the booksByCategory
	 */
	public BooksByCategory get(Long booksByCategoryid);

	/**
	 * Perform an booksByCategory deletion.
	 * @param id the given id
	 * @return state of deletion (true if ok otherwise false)
	 */
	public Boolean delete(Long booksByCategoryid);

	/**
	 * Perform an booksByCategory creation.
	 * @param booksByCategory to create
	 * @return created booksByCategory
	 */
	public BooksByCategory create(BooksByCategory booksByCategory);

	/**
	 * Perform an booksByCategory update.
	 * @param booksByCategory to update
	 * @return state of update (true if ok otherwise false)
	 */
	public Boolean save(BooksByCategory booksByCategory);

	/**
	 * Test booksByCategory existence.
	 * @param booksByCategory to check
	 * @return true if author exist otherwise false
	 */
	public Boolean exist(BooksByCategory booksByCategory);
	
	public List<BooksByCategory> findAll();
}
