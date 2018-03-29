package com.diviso.payment.domain;

import com.paypal.api.payments.Phone;

import lombok.Data;

@Data
public class PayeeDisplayMetaData {
	/**
	 * First Name of the Payee.
	 */
	private String firstName;

	/**
	 * Last Name of the Payee.
	 */
	private String lastName;

	/**
	 * Unencrypted PayPal account Number of the Payee
	 */

	private Phone display_phone;
}
