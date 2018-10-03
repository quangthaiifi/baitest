package com.example.demo.entity;
// Generated Oct 2, 2018 5:55:30 AM by Hibernate Tools 5.2.10.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BooksHasLibrariesId generated by hbm2java
 */
@Embeddable
public class BooksHasLibrariesId implements java.io.Serializable {
	
	private int booksIsbn;
	private int librariesLibraryId;

	public BooksHasLibrariesId() {
	}

	public BooksHasLibrariesId(int booksIsbn, int librariesLibraryId) {
		this.booksIsbn = booksIsbn;
		this.librariesLibraryId = librariesLibraryId;
	}

	@Column(name = "books_isbn", nullable = false)
	public int getBooksIsbn() {
		return this.booksIsbn;
	}

	public void setBooksIsbn(int booksIsbn) {
		this.booksIsbn = booksIsbn;
	}

	@Column(name = "libraries_library_id", nullable = false)
	public int getLibrariesLibraryId() {
		return this.librariesLibraryId;
	}

	public void setLibrariesLibraryId(int librariesLibraryId) {
		this.librariesLibraryId = librariesLibraryId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BooksHasLibrariesId))
			return false;
		BooksHasLibrariesId castOther = (BooksHasLibrariesId) other;

		return (this.getBooksIsbn() == castOther.getBooksIsbn())
				&& (this.getLibrariesLibraryId() == castOther.getLibrariesLibraryId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getBooksIsbn();
		result = 37 * result + this.getLibrariesLibraryId();
		return result;
	}

}