package com.cognizant.ormlearn.service;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import com.cognizant.ormlearn.model.Country;

public interface CountryService {

	@Transactional
	public List<Country> getAllCountries();
}