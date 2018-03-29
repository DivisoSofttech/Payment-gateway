package com.diviso.payment.domain;

import lombok.Data;

@Data
public class Details {

	private String subtotal;
	private String tax;
	private String shipping;
	private String handling_fee;
	private String shipping_discount;
	private String insurance;
	
}
