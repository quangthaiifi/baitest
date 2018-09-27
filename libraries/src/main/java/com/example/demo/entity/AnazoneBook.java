/*
 * Created on 2018-09-27 ( Date ISO 2018-09-27 - Time 10:13:02 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * Persistent class for AnazoneBook entity stored in table anazone_book.
 * This class is a "record entity" without JPA links.
 * @author Telosys (http://www.telosys.org/) version 3.0.0
 */
@Entity
@Table(name="anazone_book", catalog="liberaries" )
public class AnazoneBook implements Serializable {

	private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="isbn", nullable=false)
    private Long isbn ; 
    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="title", length=45)
    private String title ;     @Temporal(TemporalType.TIMESTAMP)
    @Column(name="authors")
    private Date authors ;     @Column(name="data_of_publication", length=45)
    private String dataOfPublication ;     @Column(name="amazone_star_rating", length=45)
    private String amazoneStarRating ;     @Column(name="pulishser")
    private Byte pulishser ;     @Column(name="list_price", length=45)
    private String listPrice ;     @Column(name="amazoe_price", length=45)
    private String amazoePrice ;     @Column(name="your_saving", length=45)
    private String yourSaving ; 

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public AnazoneBook() {
		super();
    }

    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
	public void setIsbn(Long isbn) {
        this.isbn = isbn ;
    }
	public Long getIsbn() {
        return this.isbn;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
	//--- DATABASE MAPPING : title (VARCHAR) 
	public void setTitle(String title) {this.title = title;}
	public String getTitle() {return this.title;}

	//--- DATABASE MAPPING : authors (DATETIME) 
	public void setAuthors(Date authors) {this.authors = authors;}
	public Date getAuthors() {return this.authors;}

	//--- DATABASE MAPPING : data_of_publication (VARCHAR) 
	public void setDataOfPublication(String dataOfPublication) {this.dataOfPublication = dataOfPublication;}
	public String getDataOfPublication() {return this.dataOfPublication;}

	//--- DATABASE MAPPING : amazone_star_rating (VARCHAR) 
	public void setAmazoneStarRating(String amazoneStarRating) {this.amazoneStarRating = amazoneStarRating;}
	public String getAmazoneStarRating() {return this.amazoneStarRating;}

	//--- DATABASE MAPPING : pulishser (TINYINT) 
	public void setPulishser(Byte pulishser) {this.pulishser = pulishser;}
	public Byte getPulishser() {return this.pulishser;}

	//--- DATABASE MAPPING : list_price (VARCHAR) 
	public void setListPrice(String listPrice) {this.listPrice = listPrice;}
	public String getListPrice() {return this.listPrice;}

	//--- DATABASE MAPPING : amazoe_price (VARCHAR) 
	public void setAmazoePrice(String amazoePrice) {this.amazoePrice = amazoePrice;}
	public String getAmazoePrice() {return this.amazoePrice;}

	//--- DATABASE MAPPING : your_saving (VARCHAR) 
	public void setYourSaving(String yourSaving) {this.yourSaving = yourSaving;}
	public String getYourSaving() {return this.yourSaving;}


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(isbn); 
		sb.append(title); 
		sb.append("|"); 
		sb.append(authors); 
		sb.append("|"); 
		sb.append(dataOfPublication); 
		sb.append("|"); 
		sb.append(amazoneStarRating); 
		sb.append("|"); 
		sb.append(pulishser); 
		sb.append("|"); 
		sb.append(listPrice); 
		sb.append("|"); 
		sb.append(amazoePrice); 
		sb.append("|"); 
		sb.append(yourSaving); 
        return sb.toString();
    }
}