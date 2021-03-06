/*
 * Created on 2018-10-02 ( Date ISO 2018-10-02 - Time 05:57:23 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.example.demo.service.criteria;

/**
 * Criteria bean used for Categories search.
 * @author Telosys (http://www.telosys.org/) version 3.0.0
 */
public class CategoriesCriteria {

    private String categoryName; 
	// Constructor
	public CategoriesCriteria() {
		// Needed empty constructor for serialization
	}

	public void setCategoryName(String categoryName) {this.categoryName = categoryName;}
	public String getCategoryName() {return this.categoryName;}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(categoryName); 
        return sb.toString();
	}
}
