package com.diviso.payment.domain;


import lombok.Data;

@Data
public class Payee {
	/**
	 * Email Address associated with the Payee's PayPal Account. If the provided
	 * email address is not associated with any PayPal Account, the payee can only
	 * receiver PayPal Wallet Payments. Direct Credit Card Payments will be denied
	 * due to card compliance requirements.
	 */
	private String email;

	/**
	 * Encrypted PayPal account identifier for the Payee.
	 */
	private String merchantId;

	private String accountNumber;

	private PayeeDisplayMetaData payee_display_metadata;

}
