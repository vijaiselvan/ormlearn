package com.cognizant.ormlearn.service;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.services.exception.CountryNotFoundException;

public interface CountryService {

	@Transactional
	public List<Country> getAllCountries();
	
	public void addCountry(Country country);

	public void deleteCountry(String code);
	
	public Country findCountryByCode(String countryCode) throws CountryNotFoundException;
}