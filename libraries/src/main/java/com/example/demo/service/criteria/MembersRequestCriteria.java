/*
 * Created on 2018-09-27 ( Date ISO 2018-09-27 - Time 10:13:03 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.example.demo.service.criteria;

/**
 * Criteria bean used for MembersRequest search.
 * @author Telosys (http://www.telosys.org/) version 3.0.0
 */
public class MembersRequestCriteria {

    private String dataRequested; 
    private String dateLocated; 
    private String otherrequestDetails; 
	// Constructor
	public MembersRequestCriteria() {
		// Needed empty constructor for serialization
	}

	public void setDataRequested(String dataRequested) {this.dataRequested = dataRequested;}
	public String getDataRequested() {return this.dataRequested;}
	public void setDateLocated(String dateLocated) {this.dateLocated = dateLocated;}
	public String getDateLocated() {return this.dateLocated;}
	public void setOtherrequestDetails(String otherrequestDetails) {this.otherrequestDetails = otherrequestDetails;}
	public String getOtherrequestDetails() {return this.otherrequestDetails;}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(dataRequested); 
		sb.append("|"); 
		sb.append(dateLocated); 
		sb.append("|"); 
		sb.append(otherrequestDetails); 
        return sb.toString();
	}
}