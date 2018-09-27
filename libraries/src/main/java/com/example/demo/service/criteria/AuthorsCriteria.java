/*
 * Created on 2018-09-27 ( Date ISO 2018-09-27 - Time 10:13:02 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.example.demo.service.criteria;

/**
 * Criteria bean used for Authors search.
 * @author Telosys (http://www.telosys.org/) version 3.0.0
 */
public class AuthorsCriteria {

    private String authorFirstName; 
    private String authorLastName; 
	// Constructor
	public AuthorsCriteria() {
		// Needed empty constructor for serialization
	}

	public void setAuthorFirstName(String authorFirstName) {this.authorFirstName = authorFirstName;}
	public String getAuthorFirstName() {return this.authorFirstName;}
	public void setAuthorLastName(String authorLastName) {this.authorLastName = authorLastName;}
	public String getAuthorLastName() {return this.authorLastName;}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(authorFirstName); 
		sb.append("|"); 
		sb.append(authorLastName); 
        return sb.toString();
	}
}