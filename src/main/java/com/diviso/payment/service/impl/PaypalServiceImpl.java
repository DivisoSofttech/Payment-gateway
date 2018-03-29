package com.diviso.payment.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.diviso.payment.client.paypal.api.PaypalApi;
import com.diviso.payment.domain.Payment;
import com.diviso.payment.domain.PaymentExecution;
import com.diviso.payment.service.PaypalService;
import com.paypal.api.payments.Patch;
import com.paypal.api.payments.PaymentHistory;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PaypalServiceImpl implements PaypalService {

	@Autowired
	private PaypalApi paypalApi;

	@Override
	public Payment pay(Payment payment) {
		log.info("pay creates the payment to be execute " + payment);
		return paypalApi.pay(payment);

	}

	@Override
	public PaymentHistory getAllPayments() {
		log.info("get all payments ");
		return paypalApi.getAllPayments();
	}

	@Override
	public Payment getPayment(String payment_id) {
		log.info("Get the specified payment using the payment id");
		return paypalApi.getPayment(payment_id);
	}

	@Override
	public Payment updatePayment(String payment_id, ArrayList<Patch> patchRequest) {
		log.info("update the payment using the payment id " + payment_id + " and the " + patchRequest);
		return paypalApi.updatePayment(payment_id, patchRequest);
	}

	@Override
	public Payment executePayment(String payment_id,PaymentExecution paymentExecution) {
		log.info("");
		return paypalApi.executePayment(payment_id,paymentExecution);
	}

}
