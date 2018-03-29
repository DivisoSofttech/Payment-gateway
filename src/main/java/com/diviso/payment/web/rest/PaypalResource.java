package com.diviso.payment.web.rest;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.payment.domain.Payment;
import com.diviso.payment.domain.PaymentExecution;
import com.diviso.payment.service.PaypalService;
import com.paypal.api.payments.Patch;
import com.paypal.api.payments.PaymentHistory;


@RestController
@RequestMapping("/api")
public class PaypalResource {

	@Autowired
	private PaypalService service;

	/*
	 * The method is used to create a payment using the transaction details
	 * 
	 * @Parm The Payment object to create a simple payment
	 * 
	 * @Return The return object is the payment that is created
	 */

	@PostMapping("/paypal/pay")
	public Payment pay(@RequestBody Payment payment) {
		return service.pay(payment);
	}

	/*
	 * The method return the list of payments
	 * 
	 * @Return returns the PaymentHistory object
	 */

	@GetMapping("/paypal/payments")
	public PaymentHistory getAllPayments() {
		return service.getAllPayments();
	}

	/*
	 * The method return the specified payment by searh using payment id
	 * 
	 * @Param the payment id of the specified payment
	 * 
	 * @Return return the payment object
	 */
	@GetMapping("/paypal/payments/{payment_id}")
	public Payment getPayment(@PathVariable String payment_id) {
		return service.getPayment(payment_id);
	}

	/*
	 * The method used to update the created payment
	 * 
	 * @Param payment id of the payment and the patch request
	 * 
	 * @Return return thye payment afer updation
	 */
	@PatchMapping("/paypal/payments/{payment_id}")
	public Payment updatePayment(@PathVariable String payment_id, @RequestBody ArrayList<Patch> patchRequest) {
		return service.updatePayment(payment_id, patchRequest);
	}

	@PostMapping("paypal/payments/payment/{payment_id}/execute")
	public Payment executePayment(@PathVariable String payment_id,
		 @RequestBody(required=false) PaymentExecution paymentExecution) {
		return service.executePayment(payment_id,paymentExecution);
	}

}
