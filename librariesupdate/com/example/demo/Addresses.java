package com.example.demo;
// Generated Sep 28, 2018 9:42:18 AM by Hibernate Tools 5.2.10.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Addresses generated by hbm2java
 */
@Entity
@Table(name = "addresses", catalog = "librares")
public class Addresses implements java.io.Serializable {

	private Integer addressId;
	private String line1NumberBuilding;
	private String line2NumberStreet;
	private String line3areaLocality;
	private String city;
	private String zipPostcode;
	private String stateProvicenCounty;
	private String country;
	private String otherAddressDetails;
	private Set librarieses = new HashSet(0);
	private Set memberses = new HashSet(0);

	public Addresses() {
	}

	public Addresses(String line1NumberBuilding, String line2NumberStreet, String line3areaLocality, String city,
			String zipPostcode, String stateProvicenCounty, String country, String otherAddressDetails, Set librarieses,
			Set memberses) {
		this.line1NumberBuilding = line1NumberBuilding;
		this.line2NumberStreet = line2NumberStreet;
		this.line3areaLocality = line3areaLocality;
		this.city = city;
		this.zipPostcode = zipPostcode;
		this.stateProvicenCounty = stateProvicenCounty;
		this.country = country;
		this.otherAddressDetails = otherAddressDetails;
		this.librarieses = librarieses;
		this.memberses = memberses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "address_id", unique = true, nullable = false)
	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	@Column(name = "line_1_number_building", length = 45)
	public String getLine1NumberBuilding() {
		return this.line1NumberBuilding;
	}

	public void setLine1NumberBuilding(String line1NumberBuilding) {
		this.line1NumberBuilding = line1NumberBuilding;
	}

	@Column(name = "line_2_number_street", length = 45)
	public String getLine2NumberStreet() {
		return this.line2NumberStreet;
	}

	public void setLine2NumberStreet(String line2NumberStreet) {
		this.line2NumberStreet = line2NumberStreet;
	}

	@Column(name = "line_3area_locality", length = 45)
	public String getLine3areaLocality() {
		return this.line3areaLocality;
	}

	public void setLine3areaLocality(String line3areaLocality) {
		this.line3areaLocality = line3areaLocality;
	}

	@Column(name = "city", length = 45)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "zip_postcode", length = 45)
	public String getZipPostcode() {
		return this.zipPostcode;
	}

	public void setZipPostcode(String zipPostcode) {
		this.zipPostcode = zipPostcode;
	}

	@Column(name = "state_provicen_county", length = 45)
	public String getStateProvicenCounty() {
		return this.stateProvicenCounty;
	}

	public void setStateProvicenCounty(String stateProvicenCounty) {
		this.stateProvicenCounty = stateProvicenCounty;
	}

	@Column(name = "country", length = 45)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "other_address_details", length = 45)
	public String getOtherAddressDetails() {
		return this.otherAddressDetails;
	}

	public void setOtherAddressDetails(String otherAddressDetails) {
		this.otherAddressDetails = otherAddressDetails;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "addresses")
	public Set getLibrarieses() {
		return this.librarieses;
	}

	public void setLibrarieses(Set librarieses) {
		this.librarieses = librarieses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "addresses")
	public Set getMemberses() {
		return this.memberses;
	}

	public void setMemberses(Set memberses) {
		this.memberses = memberses;
	}

}
