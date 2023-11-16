package com.reactive.trial.stocktrader.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reactive.trial.stocktrader.model.Stock;
import com.reactive.trial.stocktrader.service.StocksService;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@RequestMapping("/stocks")
public class StocksController {

	private StocksService stocksService;

	@GetMapping("/{id}")
	public Mono<Stock> getStockById(@PathVariable String id) {
		return stocksService.getStockById(id);
	}

	@GetMapping
	public Flux<Stock> getAllStocks() {
		return stocksService.getAllStocks();
	}

	@PostMapping
	public Mono<Stock> createStock(@RequestBody Stock stock) {
		return stocksService.createStock(stock);
	}

}
