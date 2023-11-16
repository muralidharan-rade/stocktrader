package com.reactive.trial.stocktrader.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.reactive.trial.stocktrader.model.Stock;

@Repository
public interface StocksRepository extends ReactiveMongoRepository<Stock, String> {

}
