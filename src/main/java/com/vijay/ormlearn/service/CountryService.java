package com.vijay.ormlearn.service;

import java.util.List;

import com.vijay.ormlearn.model.Country;
import com.vijay.ormlearn.services.exception.CountryNotFoundException;

public interface CountryService {

	public List<Country> getAllCountries();

	public Country findCountryByCode(String countryCode) throws CountryNotFoundException;

	public void addCountry(Country country);

	public void deleteCountry(String code);

	public void updateCountry(String code, String name);

	public List<Country> searchCountry(String name);

	public List<Country> sortCountry(String name);
}