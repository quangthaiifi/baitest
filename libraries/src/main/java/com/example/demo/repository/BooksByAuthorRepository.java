/*
 * Created on 2018-09-27 ( Date ISO 2018-09-27 - Time 10:13:02 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.BooksByAuthor;
import com.example.demo.entity.BooksByAuthorKey;

/**
 * Jpa repository for BooksByAuthor.
 * @author Telosys (http://www.telosys.org/) version 3.0.0
 */
@Repository
public interface BooksByAuthorRepository  extends JpaRepository<BooksByAuthor, BooksByAuthorKey>, JpaSpecificationExecutor<BooksByAuthor> {
	
	BooksByAuthor findByCompositePrimaryKey(BooksByAuthorKey booksByAuthorKey);
}