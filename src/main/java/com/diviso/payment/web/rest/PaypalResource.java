package com.diviso.payment.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.payment.service.PaypalService;
import com.paypal.api.payments.Payment;

@RestController
@RequestMapping("/api")
public class PaypalResource {
	
	@Autowired
	private PaypalService service;
	
	@PostMapping("/paypal/pay")
	public Payment pay(Payment payment) {
		
		return service.pay(payment);
	}
	
}
