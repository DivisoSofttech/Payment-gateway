package com.diviso.payment.service;

import java.util.ArrayList;

import com.diviso.payment.domain.Payment;
import com.diviso.payment.domain.PaymentExecution;
import com.paypal.api.payments.Patch;
import com.paypal.api.payments.PaymentHistory;

public interface PaypalService {

	Payment pay(Payment payment);

	PaymentHistory getAllPayments();

	Payment getPayment(String payment_id );

	Payment updatePayment(String payment_id, ArrayList<Patch> patchRequest);

	Payment executePayment(String payment_id, PaymentExecution paymentExecution);

}
