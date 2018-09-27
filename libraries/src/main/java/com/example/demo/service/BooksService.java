/*
 * Created on 2018-09-27 ( Date ISO 2018-09-27 - Time 10:13:02 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.example.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demo.entity.Books;
import com.example.demo.service.criteria.BooksCriteria;

/**
 * Service interface for Books.
 * @author Telosys (http://www.telosys.org/) version 3.0.0
 */
public interface BooksService {

	/**
	 * Perform a pageable and filtered search.
	 * @param pageable pagination configuration
	 * @param criteria filters
	 * @return a page of books
	 */
	public Page<Books> search(Pageable pageable, BooksCriteria criteria);
	/**
	 * Recover an books following an id.
	 * @param id the given id
	 * @return the books
	 */
	public Books get(Long isbn);

	/**
	 * Perform an books deletion.
	 * @param id the given id
	 * @return state of deletion (true if ok otherwise false)
	 */
	public Boolean delete(Long isbn);

	/**
	 * Perform an books creation.
	 * @param books to create
	 * @return created books
	 */
	public Books create(Books books);

	/**
	 * Perform an books update.
	 * @param books to update
	 * @return state of update (true if ok otherwise false)
	 */
	public Boolean save(Books books);

	/**
	 * Test books existence.
	 * @param books to check
	 * @return true if author exist otherwise false
	 */
	public Boolean exist(Books books);
}
