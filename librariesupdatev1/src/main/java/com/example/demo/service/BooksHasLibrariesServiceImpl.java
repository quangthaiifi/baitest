/*
 * Created on 2018-10-02 ( Date ISO 2018-10-02 - Time 05:57:23 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import com.example.demo.entity.BooksHasLibraries;
import com.example.demo.entity.BooksHasLibrariesId;
import com.example.demo.repository.BooksHasLibrariesRepository;

import org.hibernate.hql.internal.ast.tree.BooleanLiteralNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class BooksHasLibrariesServiceImpl implements BooksHasLibrariesService {

	@Autowired
	private BooksHasLibrariesRepository booksHasLibrariesRepository;

	@Override
	public BooksHasLibraries getOne(BooksHasLibrariesId librariesLibraryId) {
		return booksHasLibrariesRepository.findById(librariesLibraryId).get();
	}

	@Override
	public Boolean delete(BooksHasLibrariesId librariesLibraryId) {
		if (booksHasLibrariesRepository.getOne(librariesLibraryId) != null) {
			booksHasLibrariesRepository.deleteById(librariesLibraryId);
			return true;
		}
		return false;
	}

	@Override
	public BooksHasLibraries create(BooksHasLibraries booksHasLibraries) {
		return booksHasLibrariesRepository.save(booksHasLibraries);
	}

	@Override
	public Boolean update(BooksHasLibraries booksHasLibrariesToUpdate) {
		BooksHasLibraries booksHasLibraries = booksHasLibrariesRepository.getOne(booksHasLibrariesToUpdate.getId());
		if(booksHasLibraries!=null)
		{
		 booksHasLibrariesRepository.save(booksHasLibrariesToUpdate);
		 return true;
		}
		else return false;
		
	}

	@Override
	public Boolean exist(BooksHasLibraries booksHasLibraries) {
		return booksHasLibrariesRepository.existsById(booksHasLibraries.getId());
	}

	@Override
	public List<BooksHasLibraries> findAll() {
		return booksHasLibrariesRepository.findAll();
	}

}
