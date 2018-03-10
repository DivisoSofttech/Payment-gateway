package com.diviso.payment.service;

import com.paypal.api.payments.Payment;

public interface PaypalService {

	Payment pay(Payment payment);

}
