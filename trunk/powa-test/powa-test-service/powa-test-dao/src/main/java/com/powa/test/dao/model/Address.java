package com.powa.test.dao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "ADDRESS")
public class Address {
	
	@Id
	@Column(name = "ADDRESS_ID")
	private Long addressID;
	
	@Column(name = "LINE_1")
	private String line1;
	
	@Column(name = "LINE_2")
	private String line2;
	
	@Column(name = "CITY")
	private String city;
	
	@Column(name = "STATE")
	private String state;
	
	/**
	 * ISO 3166 3-digit country code
	 */
	@Column(name = "COUNTRY", length = 3, columnDefinition = "char(3)")
	private String country;

	public Long getAddressID() {
		return addressID;
	}

	public void setAddressID(Long addressID) {
		this.addressID = addressID;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
