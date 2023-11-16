package com.reactive.trial.stocktrader.service;

import org.springframework.stereotype.Service;

import com.reactive.trial.stocktrader.model.Stock;
import com.reactive.trial.stocktrader.repository.StocksRepository;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class StocksService {

	private StocksRepository stocksRepository;

	public Mono<Stock> getStockById(String id) {
		return stocksRepository.findById(id);
	}

	public Flux<Stock> getAllStocks() {
		return stocksRepository.findAll();
	}

	public Mono<Stock> createStock(Stock stock) {
		return stocksRepository.save(stock);
	}

}
