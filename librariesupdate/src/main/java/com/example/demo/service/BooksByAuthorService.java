/*
 * Created on 2018-09-28 ( Date ISO 2018-09-28 - Time 09:53:16 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.example.demo.service;

import com.example.demo.entity.BooksByAuthor;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service interface for BooksByAuthor.
 * @author Telosys (http://www.telosys.org/) version 3.0.0
 */
public interface BooksByAuthorService {

	/**
	 * Perform a pageable and filtered search.
	 * @param pageable pagination configuration
	 * @return a page of booksByAuthor
	 */
	public Page<BooksByAuthor> search(Pageable pageable);
	/**
	 * Recover an booksByAuthor following an id.
	 * @param id the given id
	 * @return the booksByAuthor
	 */
	public BooksByAuthor get(Long booksHasAuthorsid);

	/**
	 * Perform an booksByAuthor deletion.
	 * @param id the given id
	 * @return state of deletion (true if ok otherwise false)
	 */
	public Boolean delete(Long booksHasAuthorsid);

	/**
	 * Perform an booksByAuthor creation.
	 * @param booksByAuthor to create
	 * @return created booksByAuthor
	 */
	public BooksByAuthor create(BooksByAuthor booksByAuthor);

	/**
	 * Perform an booksByAuthor update.
	 * @param booksByAuthor to update
	 * @return state of update (true if ok otherwise false)
	 */
	public Boolean save(BooksByAuthor booksByAuthor);

	/**
	 * Test booksByAuthor existence.
	 * @param booksByAuthor to check
	 * @return true if author exist otherwise false
	 */
	public Boolean exist(BooksByAuthor booksByAuthor);
	
	public List<BooksByAuthor> findAll();
}