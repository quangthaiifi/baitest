package com.example.demo;
// Generated Sep 28, 2018 9:42:18 AM by Hibernate Tools 5.2.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * BooksByCategory generated by hbm2java
 */
@Entity
@Table(name = "books_by_category", catalog = "librares")
public class BooksByCategory implements java.io.Serializable {

	private Integer booksByCategoryid;
	private Books books;
	private Categories categories;

	public BooksByCategory() {
	}

	public BooksByCategory(Books books, Categories categories) {
		this.books = books;
		this.categories = categories;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "books_by_categoryid", unique = true, nullable = false)
	public Integer getBooksByCategoryid() {
		return this.booksByCategoryid;
	}

	public void setBooksByCategoryid(Integer booksByCategoryid) {
		this.booksByCategoryid = booksByCategoryid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "isbn", nullable = false)
	public Books getBooks() {
		return this.books;
	}

	public void setBooks(Books books) {
		this.books = books;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id", nullable = false)
	public Categories getCategories() {
		return this.categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

}
