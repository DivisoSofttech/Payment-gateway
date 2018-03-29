package com.diviso.payment.client.paypal.api;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.diviso.payment.domain.Payment;
import com.diviso.payment.domain.PaymentExecution;
import com.paypal.api.payments.Patch;
import com.paypal.api.payments.PaymentHistory;


public interface PaypalApi {
	
	@RequestMapping(value = "/payments/payment", produces = "*/*", consumes = "application/json", method = RequestMethod.POST)
	public Payment pay(@RequestBody Payment payment);

	@RequestMapping(value = "/payments/payment", produces = "*/*", consumes = "application/json", method = RequestMethod.GET)
	public PaymentHistory getAllPayments();

	@RequestMapping(value = "/payments/payment/{payment_id}", produces = "*/*", consumes = "application/json", method = RequestMethod.GET)
	public Payment getPayment(@PathVariable(value = "payment_id") String payment_id);

	@RequestMapping(value = "/payments/payment/{payment_id}", produces = "*/*", consumes = "application/json", method = RequestMethod.PATCH)
	public Payment updatePayment(@PathVariable(value = "payment_id") String payment_id,
			@RequestBody ArrayList<Patch> patchRequest);

	@RequestMapping(value = "/payments/payment/{payment_id}/execute" + 
			"", produces = "*/*", consumes = "application/json", method = RequestMethod.POST)
	public Payment executePayment(@PathVariable(value="payment_id") String payment_id, @RequestBody(required=false) PaymentExecution paymentExecution);
}
