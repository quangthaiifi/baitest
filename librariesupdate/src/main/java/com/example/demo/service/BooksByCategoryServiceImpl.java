/*
 * Created on 2018-09-28 ( Date ISO 2018-09-28 - Time 09:53:16 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.example.demo.service;
import com.example.demo.entity.BooksByCategory;
import com.example.demo.repository.BooksByCategoryRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Service implementation for BooksByCategory.
 * @author Telosys (http://www.telosys.org/) version 3.0.0
 */
@Service
public class BooksByCategoryServiceImpl implements BooksByCategoryService {

	@Autowired
	private BooksByCategoryRepository booksByCategoryRepository;

	@Override
	public Page<BooksByCategory> search(Pageable pageable) {
		return booksByCategoryRepository.findAll(pageable);
	}

	@Override
	public BooksByCategory get(Long booksByCategoryid) {
		return booksByCategoryRepository.findByBooksByCategoryid(booksByCategoryid);
	}

	@Override
	public Boolean delete(Long booksByCategoryid) {
		if (booksByCategoryRepository.findByBooksByCategoryid(booksByCategoryid) != null) {
			booksByCategoryRepository.deleteById(booksByCategoryid);
			return true;
		}
		return false;
	}

	@Override
	public BooksByCategory create(BooksByCategory booksByCategory) {
		return booksByCategoryRepository.save(booksByCategory);
	}

	@Override
	public Boolean save(BooksByCategory booksByCategory) {
		final Long pk = booksByCategory.getBooksByCategoryid();
		if (booksByCategoryRepository.findByBooksByCategoryid(pk) != null) {
			booksByCategoryRepository.save(booksByCategory);
			return true;
		}
		return false;
	}

	@Override
	public Boolean exist(BooksByCategory booksByCategory) {
		return booksByCategoryRepository.existsById(booksByCategory.getBooksByCategoryid());
	}

	@Override
	public List<BooksByCategory> findAll() {
		// TODO Auto-generated method stub
		return booksByCategoryRepository.findAll();
	}


}
