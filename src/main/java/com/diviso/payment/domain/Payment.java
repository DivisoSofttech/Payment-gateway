package com.diviso.payment.domain;

import java.util.List;

import lombok.Data;

@Data
public class Payment {

	/**
	 * ID of the created payment, the 'transaction ID'
	 */
	//private String id;

	/**
	 * Payment intent.
	 */
	private String intent;

	/**
	 * Source of the funds for this payment represented by a PayPal account or a direct credit card.
	 */
	private Payer payer;

	/**
	 * Information that the merchant knows about the payer.  This information is not definitive and only serves as a hint to the UI or any pre-processing logic.
	 *//*
	private PotentialPayerInfo potentialPayerInfo;

	*//**
	 * Receiver of funds for this payment. **Readonly for PayPal external REST payments.**
	 *//*
	private Payee payee;

	*//**
	 * ID of the cart to execute the payment.
	 *//*
	private String cart;

*/	/**
	 * Transactional details including the amount and item details.
	 */
	private List<Transaction> transactions;
/*
	*//**
	 * Applicable for advanced payments like multi seller payment (MSP) to support partial failures
	 *//*
	private List<Error> failedTransactions;

	*//**
	 * Collection of PayPal generated billing agreement tokens.
	 *//*
	private List<BillingAgreementToken> billingAgreementTokens;

	*//**
	 * Credit financing offered to payer on PayPal side. Returned in payment after payer opts-in
	 *//*
	private CreditFinancingOffered creditFinancingOffered;

	*//**
	 * Instructions for the payer to complete this payment.
	 *//*
	private PaymentInstruction paymentInstruction;

	*//**
	 * Payment state.
	 *//*
	private String state;

	*//**
	 * PayPal generated identifier for the merchant's payment experience profile. Refer to [this](https://developer.paypal.com/webapps/developer/docs/api/#payment-experience) link to create experience profile ID.
	 *//*
	private String experience_profile_id ;

	*//**
	 * free-form field for the use of clients to pass in a message to the payer
	 */
	//private String note_to_payer ;

	private String note_to_payer;
	private Links redirect_urls;
	/**
	 * Set of redirect URLs you provide only for PayPal-based payments.
	 */
	// RedirectUrls redirect_urls ;

/*	*//**
	 * Failure reason code returned when the payment failed for some valid reasons.
	 *//*
	private String failureReason;

	
	*//**
	 * Payment creation time as defined in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6).
	 *//*
	private String createTime;

	*//**
	 * Payment update time as defined in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6).
	 *//*
	private String updateTime;

	*//**
	 * 
	 *//*
	private List<Links> links;*/


}
