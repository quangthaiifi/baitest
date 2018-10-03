/*
 * Created on 2018-10-02 ( Date ISO 2018-10-02 - Time 05:57:23 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.example.demo.repository;

import com.example.demo.entity.AmazonBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Jpa repository for AmazonBook.
 * @author Telosys (http://www.telosys.org/) version 3.0.0
 */
@Repository
public interface AmazonBookRepository  extends JpaRepository<AmazonBook, Integer> {
	
	AmazonBook findByIsbn(Integer isbn);
}