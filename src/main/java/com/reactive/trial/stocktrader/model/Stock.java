package com.reactive.trial.stocktrader.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Stock {

	private String id;
	private String name;
	private String price;
	private String currency;

}
