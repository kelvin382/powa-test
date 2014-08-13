package com.powa.test.dao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "CREDIT_CARD")
public class CreditCard {
	
	@Id
	@Column(name = "CARD_NUMBER")
	private String cardNumber;
	
	@Column(name = "EXPIRE_YEAR", length = 4)
	private String expireYear;
	
	@Column(name = "EXPIRE_MONTH", length = 2)
	private String expireMonth;
	
	@Column(name = "USER_ID")
	private Long userID;

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpireYear() {
		return expireYear;
	}

	public void setExpireYear(String expireYear) {
		this.expireYear = expireYear;
	}

	public String getExpireMonth() {
		return expireMonth;
	}

	public void setExpireMonth(String expireMonth) {
		this.expireMonth = expireMonth;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}
}
