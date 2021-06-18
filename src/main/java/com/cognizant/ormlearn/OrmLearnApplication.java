package com.cognizant.ormlearn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication {

	private static final Logger logger = LoggerFactory.getLogger(OrmLearnApplication.class);

	public static void main(String[] args) {
		
		SpringApplication.run(OrmLearnApplication.class, args);
	}

	@Bean
	CommandLineRunner getAllCountries(CountryService countryService) {
		return args -> {
			logger.info("START...");
			List<Country> countries = countryService.getAllCountries();
			logger.debug("countries = {}", countries);
			logger.info("END...");
		};
	}
	
	@Bean
	CommandLineRunner addCountry(CountryService countryService) {
		return args -> {
			logger.info("START...");
			countryService.addCountry(new Country("UAE", "United Arab Emirates"));
			logger.info("END...");
		};
	}
	
	@Bean
	CommandLineRunner deleteCountryByCode(CountryService countryService) {
		return args -> {
			logger.info("START");
			countryService.deleteCountry("CA");
			logger.info("END");
		};
	}
	
	@Bean
	CommandLineRunner findCountryByCode(CountryService countryService) {
		return args -> {
			logger.info("START");
			Country country = countryService.findCountryByCode("CA");
			logger.debug("Country : {}", country);
			logger.info("END");
		};
	}
	
}