/*
 * Created on 2018-09-27 ( Date ISO 2018-09-27 - Time 10:13:02 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.example.demo.service.criteria;

/**
 * Criteria bean used for Books search.
 * @author Telosys (http://www.telosys.org/) version 3.0.0
 */
public class BooksCriteria {

    private String bookTitle; 
	// Constructor
	public BooksCriteria() {
		// Needed empty constructor for serialization
	}

	public void setBookTitle(String bookTitle) {this.bookTitle = bookTitle;}
	public String getBookTitle() {return this.bookTitle;}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(bookTitle); 
        return sb.toString();
	}
}