package com.example.demo.entity;
// Generated Sep 28, 2018 9:48:26 AM by Hibernate Tools 5.2.10.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AmazoneBooks generated by hbm2java
 */
@Entity
@Table(name = "amazone_books", catalog = "librares")
public class AmazoneBooks implements java.io.Serializable {

	private Long isbn;
	private String title;
	private String authors;
	private Date dateOfPublication;
	private String amazonStartRating;
	private Byte publisher;
	private String lishPrice;
	private Long amazonPrice;
	private String yourSaving;

	public AmazoneBooks() {
	}

	public AmazoneBooks(String title, String authors, Date dateOfPublication, String amazonStartRating, Byte publisher,
			String lishPrice, Long amazonPrice, String yourSaving) {
		this.title = title;
		this.authors = authors;
		this.dateOfPublication = dateOfPublication;
		this.amazonStartRating = amazonStartRating;
		this.publisher = publisher;
		this.lishPrice = lishPrice;
		this.amazonPrice = amazonPrice;
		this.yourSaving = yourSaving;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "isbn", unique = true, nullable = false)
	public Long getIsbn() {
		return this.isbn;
	}

	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}

	@Column(name = "title", length = 45)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "authors", length = 45)
	public String getAuthors() {
		return this.authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_of_publication", length = 19)
	public Date getDateOfPublication() {
		return this.dateOfPublication;
	}

	public void setDateOfPublication(Date dateOfPublication) {
		this.dateOfPublication = dateOfPublication;
	}

	@Column(name = "amazon_start_rating", length = 45)
	public String getAmazonStartRating() {
		return this.amazonStartRating;
	}

	public void setAmazonStartRating(String amazonStartRating) {
		this.amazonStartRating = amazonStartRating;
	}

	@Column(name = "publisher")
	public Byte getPublisher() {
		return this.publisher;
	}

	public void setPublisher(Byte publisher) {
		this.publisher = publisher;
	}

	@Column(name = "lish_price", length = 45)
	public String getLishPrice() {
		return this.lishPrice;
	}

	public void setLishPrice(String lishPrice) {
		this.lishPrice = lishPrice;
	}

	@Column(name = "amazon_price")
	public Long getAmazonPrice() {
		return this.amazonPrice;
	}

	public void setAmazonPrice(Long amazonPrice) {
		this.amazonPrice = amazonPrice;
	}

	@Column(name = "your_saving", length = 45)
	public String getYourSaving() {
		return this.yourSaving;
	}

	public void setYourSaving(String yourSaving) {
		this.yourSaving = yourSaving;
	}

}
