package com.vijay.ormlearn.service.impl;

import java.math.BigDecimal;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vijay.ormlearn.model.Stock;
import com.vijay.ormlearn.repository.StockRepository;
import com.vijay.ormlearn.service.StockService;

@Service
public class StockServiceImpl implements StockService {
	@Autowired
	private StockRepository stockRepository;

	@Transactional
	public List<Stock> findByCodeAndDate() {
		System.out.println("Stocks are:");
		List<Stock> stockList = stockRepository.stockDetailsOfFacebook("FB", 9);
		return stockList;
	}

	@Transactional
	public List<Stock> findByCodeAndPrice() {
		System.out.println("GOOGL Stocks greater than 1250 are:");
		return stockRepository.stockDetailsOfGoogle("GOOGL", new BigDecimal(1250));
	}

	@Transactional
	public List<Stock> findByHighestVolume() {
		System.out.println("FB Highest Stocks are:");
		List<Stock> stockList = stockRepository.stockDetailsOfHighestFb("FB");
		return stockList;
	}

	@Transactional
	public List<Stock> findByLowestVolumeNflx() {
		return stockRepository.stockDetailsOfLowestNflx("NFLX");
	}

}
