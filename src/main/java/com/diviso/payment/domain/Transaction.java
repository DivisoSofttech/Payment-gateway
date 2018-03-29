package com.diviso.payment.domain;

import lombok.Data;

@Data
public class Transaction {
	// private String reference_id;
	private Amount amount;
	// private Payee payee;
	private String description;
	private String custom;
	private String invoice_number;
	private PaymentOptions payment_options;
	private String soft_descriptor;
	private ItemList item_list;
	// String purchase_order ;
}
