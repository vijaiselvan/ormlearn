package com.cognizant.ormlearn.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;
import com.cognizant.ormlearn.service.CountryService;

@Service("countryService")
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryRepository repository;

	@Override
	public List<Country> getAllCountries() {
		return repository.findAll();
	}
	
}