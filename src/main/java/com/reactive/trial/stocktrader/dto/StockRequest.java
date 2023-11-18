package com.reactive.trial.stocktrader.dto;

import java.math.BigDecimal;

import com.reactive.trial.stocktrader.model.Stock;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockRequest {

	private String id;
	private String name;
	private String currency;
	private BigDecimal price;

	public Stock toModel() {
		return Stock.builder().currency(this.currency).price(this.price).name(this.name).build();
	}

}
