package com.diviso.payment.domain;

import java.util.List;

import lombok.Data;

@Data
public class ItemList {

	private List<Item> items;
	private ShippingAddress shipping_address;

}
