package com.example.demo.entity;
// Generated Oct 2, 2018 5:55:30 AM by Hibernate Tools 5.2.10.Final

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
@Table(name = "addresses", catalog = "libraries")
public class Addresses implements java.io.Serializable {

	private Integer addressId;
	private String line1NumberBulding;
	private String line2NumberStreet;
	private String line3AreaLocality;
	private String city;
	private String zipPostcode;
	private String stateProvinceCountry;
	private String country;
	private String otherAddressDetail;
	private Set<Members> memberses = new HashSet<Members>(0);

	public Addresses() {
	}

	public Addresses(String line1NumberBulding, String line2NumberStreet, String line3AreaLocality, String city,
			String zipPostcode, String stateProvinceCountry, String country, String otherAddressDetail,
			Set<Members> memberses) {
		this.line1NumberBulding = line1NumberBulding;
		this.line2NumberStreet = line2NumberStreet;
		this.line3AreaLocality = line3AreaLocality;
		this.city = city;
		this.zipPostcode = zipPostcode;
		this.stateProvinceCountry = stateProvinceCountry;
		this.country = country;
		this.otherAddressDetail = otherAddressDetail;
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

	@Column(name = "line_1_number_bulding", length = 45)
	public String getLine1NumberBulding() {
		return this.line1NumberBulding;
	}

	public void setLine1NumberBulding(String line1NumberBulding) {
		this.line1NumberBulding = line1NumberBulding;
	}

	@Column(name = "line_2_number_street", length = 45)
	public String getLine2NumberStreet() {
		return this.line2NumberStreet;
	}

	public void setLine2NumberStreet(String line2NumberStreet) {
		this.line2NumberStreet = line2NumberStreet;
	}

	@Column(name = "line_3_area_locality", length = 45)
	public String getLine3AreaLocality() {
		return this.line3AreaLocality;
	}

	public void setLine3AreaLocality(String line3AreaLocality) {
		this.line3AreaLocality = line3AreaLocality;
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

	@Column(name = "state_province_country", length = 45)
	public String getStateProvinceCountry() {
		return this.stateProvinceCountry;
	}

	public void setStateProvinceCountry(String stateProvinceCountry) {
		this.stateProvinceCountry = stateProvinceCountry;
	}

	@Column(name = "country", length = 45)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "other_address_detail", length = 45)
	public String getOtherAddressDetail() {
		return this.otherAddressDetail;
	}

	public void setOtherAddressDetail(String otherAddressDetail) {
		this.otherAddressDetail = otherAddressDetail;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "addresses")
	public Set<Members> getMemberses() {
		return this.memberses;
	}

	public void setMemberses(Set<Members> memberses) {
		this.memberses = memberses;
	}

}
