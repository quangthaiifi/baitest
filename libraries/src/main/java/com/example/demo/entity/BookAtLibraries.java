/*
 * Created on 2018-09-27 ( Date ISO 2018-09-27 - Time 10:13:02 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.example.demo.entity;


import java.io.Serializable;
import javax.persistence.*;

/**
 * Persistent class for BookAtLibraries entity stored in table book_at_libraries.
 * This class is a "record entity" without JPA links.
 * @author Telosys (http://www.telosys.org/) version 3.0.0
 */
@Entity
@Table(name="book_at_libraries", catalog="liberaries" )
public class BookAtLibraries implements Serializable {

	private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( EMBEDDED IN AN EXTERNAL CLASS )  
    //----------------------------------------------------------------------
	@EmbeddedId
    private BookAtLibrariesKey compositePrimaryKey ;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="library_name", length=45)
    private String libraryName ;     @Column(name="library_details", length=45)
    private String libraryDetails ; 

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public BookAtLibraries() {
		super();
		this.compositePrimaryKey = new BookAtLibrariesKey();       
    }

    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
	public void setLibraryId(Long libraryId) {
        this.compositePrimaryKey.setLibraryId(libraryId) ;
    }
	public Long getLibraryId() {
        return this.compositePrimaryKey.getLibraryId() ;
    }
	public void setIsbn(Long isbn) {
        this.compositePrimaryKey.setIsbn(isbn) ;
    }
	public Long getIsbn() {
        return this.compositePrimaryKey.getIsbn() ;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
	//--- DATABASE MAPPING : library_name (VARCHAR) 
	public void setLibraryName(String libraryName) {this.libraryName = libraryName;}
	public String getLibraryName() {return this.libraryName;}

	//--- DATABASE MAPPING : library_details (VARCHAR) 
	public void setLibraryDetails(String libraryDetails) {this.libraryDetails = libraryDetails;}
	public String getLibraryDetails() {return this.libraryDetails;}


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append("[" + compositePrimaryKey + "]"); 
		sb.append(libraryName); 
		sb.append("|"); 
		sb.append(libraryDetails); 
        return sb.toString();
    }
}