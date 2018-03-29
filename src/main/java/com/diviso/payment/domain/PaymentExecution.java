package com.diviso.payment.domain;

import java.util.List;

import lombok.Data;

@Data
public class PaymentExecution {

	private String payer_id;
	
	private List<Transaction> transactions;
}
