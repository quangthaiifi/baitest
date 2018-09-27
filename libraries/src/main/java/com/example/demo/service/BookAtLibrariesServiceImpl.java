/*
 * Created on 2018-09-27 ( Date ISO 2018-09-27 - Time 10:13:02 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BookAtLibraries;
import com.example.demo.entity.BookAtLibrariesKey;
import com.example.demo.repository.BookAtLibrariesRepository;
import com.example.demo.service.criteria.BookAtLibrariesCriteria;

/**
 * Service implementation for BookAtLibraries.
 * @author Telosys (http://www.telosys.org/) version 3.0.0
 */
@Service
public class BookAtLibrariesServiceImpl implements BookAtLibrariesService {

	@Autowired
	private BookAtLibrariesRepository bookAtLibrariesRepository;

	@Override
	public Page<BookAtLibraries> search(Pageable pageable, BookAtLibrariesCriteria criteria) {
		return bookAtLibrariesRepository.findAll(new BookAtLibrariesSpecification(criteria), pageable);
	}

	@Override
	public BookAtLibraries get(Long libraryId, Long isbn) {
		// Build the composite key
		BookAtLibrariesKey key = new BookAtLibrariesKey(libraryId, isbn);
		return bookAtLibrariesRepository.findByCompositePrimaryKey(key);
	}

	@Override
	public Boolean delete(Long libraryId, Long isbn) {
		// Build the composite key
		BookAtLibrariesKey key = new BookAtLibrariesKey(libraryId, isbn);
		if (bookAtLibrariesRepository.findByCompositePrimaryKey(key) != null) {
			bookAtLibrariesRepository.deleteById(key);
			return true;
		}
		return false;
	}

	@Override
	public BookAtLibraries create(BookAtLibraries bookAtLibraries) {
		return bookAtLibrariesRepository.save(bookAtLibraries);
	}

	@Override
	public Boolean save(BookAtLibraries bookAtLibraries) {
		// Build the composite key
		BookAtLibrariesKey pk = new BookAtLibrariesKey(bookAtLibraries.getLibraryId(), bookAtLibraries.getIsbn());
		if (bookAtLibrariesRepository.findByCompositePrimaryKey(pk) != null) {
			bookAtLibrariesRepository.save(bookAtLibraries);
			return true;
		}
		return false;
	}

	@Override
	public Boolean exist(BookAtLibraries bookAtLibraries) {
		// Build the composite key
		BookAtLibrariesKey pk = new BookAtLibrariesKey(bookAtLibraries.getLibraryId(), bookAtLibraries.getIsbn());
		return bookAtLibrariesRepository.existsById(pk);
	}

	class BookAtLibrariesSpecification implements Specification<BookAtLibraries> {

		private BookAtLibrariesCriteria criteria;

		public BookAtLibrariesSpecification(BookAtLibrariesCriteria criteria) {
			this.criteria = criteria;
		}

		@Override
		public Predicate toPredicate(Root<BookAtLibraries> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
			final List<Predicate> predicates = new ArrayList<>();
			if (StringUtils.isNotBlank(criteria.getLibraryName())) {
				predicates.add(builder.like(builder.lower(root.get("libraryName")),
						criteria.getLibraryName().toLowerCase() + "%"));
			}
			if (StringUtils.isNotBlank(criteria.getLibraryDetails())) {
				predicates.add(builder.like(builder.lower(root.get("libraryDetails")),
						criteria.getLibraryDetails().toLowerCase() + "%"));
			}
			return andTogether(predicates, builder);
		}

		private Predicate andTogether(List<Predicate> predicates, CriteriaBuilder builder) {
			return builder.and(predicates.toArray(new Predicate[0]));
		}
	}

}