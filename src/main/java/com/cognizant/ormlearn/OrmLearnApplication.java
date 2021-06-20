package com.cognizant.ormlearn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.model.Stock;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.StockService;

@SpringBootApplication
public class OrmLearnApplication {

	private static final Logger logger = LoggerFactory.getLogger(OrmLearnApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(OrmLearnApplication.class, args);
	}

	/************ COUNTRY *************/
//  a test method to get all countries from service.
	@Bean
	CommandLineRunner getAllCountries(CountryService countryService) {
		return args -> {
			logger.info("START...");
			List<Country> countries = countryService.getAllCountries();
			logger.debug("countries = {}", countries);
			logger.info("END...");
		};
	}

//	Find a country based on country code
	@Bean
	CommandLineRunner findCountryByCode(CountryService countryService) {
		return args -> {
			logger.info("START");
			Country country = countryService.findCountryByCode("CA");
			logger.debug("Country : {}", country);
			logger.info("END");
		};
	}

//	Add a new country
	@Bean
	CommandLineRunner addCountry(CountryService countryService) {
		return args -> {
			logger.info("START...");
			countryService.addCountry(new Country("UAE", "United Arab Emirates"));
			logger.info("END...");
		};
	}

//	Delete a country based on code
	@Bean
	CommandLineRunner deleteCountryByCode(CountryService countryService) {
		return args -> {
			logger.info("START");
			countryService.deleteCountry("CA");
			logger.info("END");
		};
	}

//	Update a country based on code
	@Bean
	CommandLineRunner updateCountry(CountryService countryService) {
		return args -> {
			logger.info("START");
			countryService.updateCountry("AF", "Andrea");
			logger.info("END");
		};
	}

//	method to search the countries with single char
	@Bean
	CommandLineRunner testSearchCountryWithSingleChar(CountryService countryService) {
		return args -> {
			logger.info("Start");
			try {
				List<Country> countryList = countryService.searchCountry("A");
				logger.debug("Countries={}", countryList);

			} catch (Exception e) {
				logger.error("message={}", e.getMessage());
			}
			logger.info("End");
		};
	}

//	method to return the countries in ascending order
	@Bean
	CommandLineRunner testSortCountry(CountryService countryService) {
		return args -> {
			logger.info("Start");
			try {

				List<Country> countryList = countryService.sortCountry("OU");
				logger.debug("Countries={}", countryList);
			} catch (Exception e) {
				logger.error("message={}", e.getMessage());
			}
			logger.info("End");
		};
	}

	/************ STOCK *************/
//	Get all stock details of Facebook in the month of September 2019.
	@Bean
	CommandLineRunner testForFacebookDate(StockService stockService) {
		return args -> {
			logger.info("Start");
			List<Stock> stockList = stockService.findByCodeAndDate();
			logger.debug("Stocks={}", stockList);
			stockList.forEach(System.out::println);
			logger.info("End");

		};
	}

//	Get all google stock details where the stock price was greater than 1250
	@Bean
	CommandLineRunner testForCodeAndPrice(StockService stockService) {
		return args -> {
			logger.info("Start");
			List<Stock> stockList = stockService.findByCodeAndPrice();
			logger.debug("Stocks={}", stockList);
			logger.info("End");
		};
	}

//	Find the top 3 dates which had highest volume of transactions
	@Bean
	CommandLineRunner testForStockHighest(StockService stockService) {
		return args -> {
			logger.info("Start");
			List<Stock> stockList = stockService.findByHighestVolume();
			logger.debug("Stocks={}", stockList);
			logger.info("End");
		};
	}

//	Identify three dates when Netflix stocks were the lowest
	@Bean
	CommandLineRunner testForStockLowest(StockService stockService) {
		return args -> {
			logger.info("Start");
			List<Stock> stockList = stockService.findByLowestVolumeNflx();
			logger.debug("Stocks={}", stockList);
			logger.info("End");
		};
	}

}