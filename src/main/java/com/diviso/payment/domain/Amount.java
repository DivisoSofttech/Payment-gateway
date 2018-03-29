package com.diviso.payment.domain;

import lombok.Data;

@Data
public class Amount {
	
	private String total;
	private String currency;
	private Details details;

}
