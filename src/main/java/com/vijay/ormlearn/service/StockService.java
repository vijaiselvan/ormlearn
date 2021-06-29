package com.vijay.ormlearn.service;

import java.util.List;

import com.vijay.ormlearn.model.Stock;
import com.vijay.ormlearn.services.exception.StockNotFoundException;

public interface StockService {

	public List<Stock> findByCodeAndDate() throws StockNotFoundException;
	
	public List<Stock> findByCodeAndPrice() throws StockNotFoundException;
	
	public List<Stock> findByHighestVolume() throws StockNotFoundException;
	
	public List<Stock> findByLowestVolumeNflx() throws StockNotFoundException;
}
