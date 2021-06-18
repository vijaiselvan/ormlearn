package com.cognizant.ormlearn.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.services.exception.CountryNotFoundException;

@Transactional()
@Service()
public class CountryServiceImpl implements CountryService {
	@Autowired
	private CountryRepository repository;

	@Override
	public List<Country> getAllCountries() {
		return repository.findAll();
	}

	@Override
	public void addCountry(Country country) {
		repository.save(country);
	}

	@Override
	public void deleteCountry(String code) {
		repository.deleteById(code);
	}

	public Country findCountryByCode(String countryCode) throws CountryNotFoundException {

		Optional<Country> result = repository.findById(countryCode);

		if (!result.isPresent()) {
			throw new CountryNotFoundException();
		}

		return (result.get());
	}

}
