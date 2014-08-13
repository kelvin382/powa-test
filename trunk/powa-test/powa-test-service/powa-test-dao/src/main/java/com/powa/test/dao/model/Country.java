package com.powa.test.dao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity(name = "COUNTRY")
@NamedQueries(value = {
		@NamedQuery(name = "getAllCountries", query = "SELECT c FROM COUNTRY c")
})
public class Country {

	@Id
	@Column(name = "ID", length = 2, columnDefinition = "CHAR(2)")
	private String id;

	@Column(name = "PHONE_CODE", length = 3, columnDefinition = "CHAR(3)")
	private String phoneCode;

	@Column(name = "ALPHA3_CODE", length = 3, columnDefinition = "CHAR(3)")
	private String alpha3Code;

	@Column(name = "CURRENCY", length = 3, columnDefinition = "CHAR(3)")
	private String currency;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhoneCode() {
		return phoneCode;
	}

	public void setPhoneCode(String phoneCode) {
		this.phoneCode = phoneCode;
	}

	public String getAlpha3Code() {
		return alpha3Code;
	}

	public void setAlpha3Code(String alpha3Code) {
		this.alpha3Code = alpha3Code;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
}
