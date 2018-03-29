package com.diviso.payment.domain;

import lombok.Data;

@Data
public class ShippingAddress {

	private String recipient_name;
	private String line1;
	private String line2;
	private String city;
	private String country_code;
	private String postal_code;
	private String phone;
	private String state;
}
