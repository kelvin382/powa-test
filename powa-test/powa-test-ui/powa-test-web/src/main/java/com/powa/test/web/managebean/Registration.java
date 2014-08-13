package com.powa.test.web.managebean;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.powa.test.service.api.StaticDataService;
import com.powa.test.web.model.UserRegistrationForm;

@SuppressWarnings("serial")
@ManagedBean(name = "registration")
@SessionScoped
public class Registration implements Serializable {

	private static final Logger log = LoggerFactory.getLogger(Registration.class);

	private UserRegistrationForm form = new UserRegistrationForm();

	@EJB(lookup = "com.powa.test.service.api.StaticDataService")
	private StaticDataService staticDataService;

	public StaticDataService getStaticDataService() {
		return staticDataService;
	}

	public UserRegistrationForm getForm() {
		return form;
	}

	public void setForm(UserRegistrationForm form) {
		this.form = form;
	}

	// navigation

	public String toFirstPage() {
		log.info("Registration First Page");

		return "REGISTRATION_FIRST_PAGE";
	}

	public String toSecondPage() {
		log.info("Registration Second Page");

		return "REGISTRATION_SECOND_PAGE";
	}

}
