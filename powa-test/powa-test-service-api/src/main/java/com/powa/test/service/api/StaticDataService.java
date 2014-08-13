package com.powa.test.service.api;

import java.io.Serializable;
import java.util.List;

public interface StaticDataService extends Serializable {

	public List<String> getCountryAlpha3Code();

}
