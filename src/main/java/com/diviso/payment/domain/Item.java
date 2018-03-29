package com.diviso.payment.domain;

import lombok.Data;

@Data
public class Item {

	private String name;
	private String description;
	private String quantity;
	private String price;
	private String tax;
	private String sku;
	private String currency;
}
