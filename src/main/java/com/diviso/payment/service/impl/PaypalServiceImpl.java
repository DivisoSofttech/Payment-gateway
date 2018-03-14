package com.diviso.payment.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diviso.payment.client.paypal.api.PaypalApi;
import com.diviso.payment.service.PaypalService;
import com.paypal.api.payments.Payment;

@Service
public class PaypalServiceImpl implements PaypalService {
	
	@Autowired
	private PaypalApi paypalApi;

	@Override
	public Payment pay(Payment payment) {
		// TODO Auto-generated method stub
		paypalApi.pay(payment);
		return null;
	}

}
