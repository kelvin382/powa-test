package com.powa.test.web.managebean;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

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
		
		// Validate first page fields
		if (form.getFirstName() == null || form.getFirstName().trim().isEmpty()) {
			FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage(FacesMessage.SEVERITY_ERROR, "First name is required", null));
			return null;
		}
		
		if (form.getLastName() == null || form.getLastName().trim().isEmpty()) {
			FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage(FacesMessage.SEVERITY_ERROR, "Last name is required", null));
			return null;
		}

		return "REGISTRATION_SECOND_PAGE";
	}
	
	public String toThirdPage() {
		log.info("Registration Third Page");
		
		// Validate second page fields
		if (form.getAddress1() == null || form.getAddress1().trim().isEmpty()) {
			FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage(FacesMessage.SEVERITY_ERROR, "Address is required", null));
			return null;
		}
		
		if (form.getCity() == null || form.getCity().trim().isEmpty()) {
			FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage(FacesMessage.SEVERITY_ERROR, "City is required", null));
			return null;
		}

		return "REGISTRATION_THIRD_PAGE";
	}
	
	public String register() {
		log.info("Processing registration for user: {} {}", form.getFirstName(), form.getLastName());
		
		try {
			// Here we would typically call a service to save the user data
			// For now, we'll just log the information
			log.info("User registered successfully: {} {}", form.getFirstName(), form.getLastName());
			log.info("Address: {}, {}, {}", form.getAddress1(), form.getCity(), form.getCountry());
			
			// Add success message
			FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Registration successful!", null));
			
			// Reset form for new registration
			form = new UserRegistrationForm();
			
			// Return to home page
			return "HOME_PAGE";
		} catch (Exception e) {
			log.error("Error during registration", e);
			FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage(FacesMessage.SEVERITY_ERROR, "Registration failed: " + e.getMessage(), null));
			return null;
		}
	}
}