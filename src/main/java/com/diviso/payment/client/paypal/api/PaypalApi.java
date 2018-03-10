package com.diviso.payment.client.paypal.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.paypal.api.payments.Payment;

public interface PaypalApi {
	
	@PostMapping(value = "/payments/payment")
	public Payment pay(@RequestBody Payment payment);

}
