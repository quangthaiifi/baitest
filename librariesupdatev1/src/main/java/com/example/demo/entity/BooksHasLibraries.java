package com.example.demo.entity;
// Generated Oct 2, 2018 5:55:30 AM by Hibernate Tools 5.2.10.Final

import javax.persistence.AttributeOverride;

import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * BooksHasLibraries generated by hbm2java
 */
@Entity
@Table(name = "books_has_libraries", catalog = "libraries")
public class BooksHasLibraries implements java.io.Serializable {

	private BooksHasLibrariesId id;
	@JsonIgnore
	private Books books;
	@JsonIgnore
	private Libraries libraries;
	private String quatityInStock;

	public BooksHasLibraries() {
	}

	public BooksHasLibraries(BooksHasLibrariesId id, Books books, Libraries libraries) {
		this.id = id;
		this.books = books;
		this.libraries = libraries;
	}

	public BooksHasLibraries(BooksHasLibrariesId id, Books books, Libraries libraries, String quatityInStock) {
		this.id = id;
		this.books = books;
		this.libraries = libraries;
		this.quatityInStock = quatityInStock;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "booksIsbn", column = @Column(name = "books_isbn", nullable = false)),
			@AttributeOverride(name = "librariesLibraryId", column = @Column(name = "libraries_library_id", nullable = false)) })
	public BooksHasLibrariesId getId() {
		return this.id;
	}

	public void setId(BooksHasLibrariesId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "books_isbn", nullable = false, insertable = false, updatable = false)
	
	public Books getBooks() {
		return this.books;
	}

	public void setBooks(Books books) {
		this.books = books;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "libraries_library_id", nullable = false, insertable = false, updatable = false)
	
	public Libraries getLibraries() {
		return this.libraries;
	}

	public void setLibraries(Libraries libraries) {
		this.libraries = libraries;
	}

	@Column(name = "quatity_in_stock", length = 45)
	public String getQuatityInStock() {
		return this.quatityInStock;
	}

	public void setQuatityInStock(String quatityInStock) {
		this.quatityInStock = quatityInStock;
	}

}