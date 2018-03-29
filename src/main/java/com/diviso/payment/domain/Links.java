package com.diviso.payment.domain;

import lombok.Data;

@Data
public class Links {
	private String return_url;
	private String cancel_url;
}
