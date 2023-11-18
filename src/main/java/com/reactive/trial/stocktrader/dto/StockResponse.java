package com.reactive.trial.stocktrader.dto;

import java.math.BigDecimal;

import com.reactive.trial.stocktrader.model.Stock;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StockResponse {

	private String id;
	private String name;
	private String currency;
	private BigDecimal price;

	public static StockResponse fromModel(Stock stock) {
		return StockResponse.builder().name(stock.getName()).currency(stock.getCurrency()).price(stock.getPrice())
				.id(stock.getId()).build();
	}

}
