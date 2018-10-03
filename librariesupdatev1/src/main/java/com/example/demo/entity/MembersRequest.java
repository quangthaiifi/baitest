package com.example.demo.entity;
// Generated Oct 2, 2018 5:55:30 AM by Hibernate Tools 5.2.10.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * MembersRequest generated by hbm2java
 */
@Entity
@Table(name = "members_request", catalog = "libraries")
public class MembersRequest implements java.io.Serializable {

	private Integer requestId;
	@JsonIgnore
	private Books books;
	@JsonIgnore 
	private Members members;
	private Date dateRequested;
	private Date dateLocated;
	private String ortherRequestDetail;

	public MembersRequest() {
	}

	public MembersRequest(Books books, Members members) {
		this.books = books;
		this.members = members;
	}

	public MembersRequest(Books books, Members members, Date dateRequested, Date dateLocated,
			String ortherRequestDetail) {
		this.books = books;
		this.members = members;
		this.dateRequested = dateRequested;
		this.dateLocated = dateLocated;
		this.ortherRequestDetail = ortherRequestDetail;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "request_id", unique = true, nullable = false)
	public Integer getRequestId() {
		return this.requestId;
	}

	public void setRequestId(Integer requestId) {
		this.requestId = requestId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "books_isbn", nullable = false)
	public Books getBooks() {
		return this.books;
	}

	public void setBooks(Books books) {
		this.books = books;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "members_member_id", nullable = false)
	public Members getMembers() {
		return this.members;
	}

	public void setMembers(Members members) {
		this.members = members;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date_requested", length = 10)
	public Date getDateRequested() {
		return this.dateRequested;
	}

	public void setDateRequested(Date dateRequested) {
		this.dateRequested = dateRequested;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date_located", length = 10)
	public Date getDateLocated() {
		return this.dateLocated;
	}

	public void setDateLocated(Date dateLocated) {
		this.dateLocated = dateLocated;
	}

	@Column(name = "orther_request_detail", length = 45)
	public String getOrtherRequestDetail() {
		return this.ortherRequestDetail;
	}

	public void setOrtherRequestDetail(String ortherRequestDetail) {
		this.ortherRequestDetail = ortherRequestDetail;
	}

}
