package com.powa.test.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.powa.test.dao.StaticDataDAO;
import com.powa.test.dao.model.Country;
import com.powa.test.service.api.StaticDataService;

@SuppressWarnings("serial")
@Stateless
@Remote(StaticDataService.class)
public class StaticDataServiceImpl implements StaticDataService {
	
	private StaticDataDAO dao;
	
	@Override
	public List<String> getCountryAlpha3Code() {
		List<Country> countries = dao.getAllCountries();
		List<String> countryCodes = new ArrayList<String>();
		
		for(Country c: countries) {
			countryCodes.add(c.getAlpha3Code());
		}
		
		return countryCodes;
	}

}
