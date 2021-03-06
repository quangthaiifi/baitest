/*
 * Created on 2018-10-02 ( Date ISO 2018-10-02 - Time 05:57:23 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.example.demo.service.criteria;

/**
 * Criteria bean used for Libraries search.
 * @author Telosys (http://www.telosys.org/) version 3.0.0
 */
public class LibrariesCriteria {

    private String libraryName; 
    private String ortherLibraryDetail; 
	// Constructor
	public LibrariesCriteria() {
		// Needed empty constructor for serialization
	}

	public void setLibraryName(String libraryName) {this.libraryName = libraryName;}
	public String getLibraryName() {return this.libraryName;}
	public void setOrtherLibraryDetail(String ortherLibraryDetail) {this.ortherLibraryDetail = ortherLibraryDetail;}
	public String getOrtherLibraryDetail() {return this.ortherLibraryDetail;}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(libraryName); 
		sb.append("|"); 
		sb.append(ortherLibraryDetail); 
        return sb.toString();
	}
}
