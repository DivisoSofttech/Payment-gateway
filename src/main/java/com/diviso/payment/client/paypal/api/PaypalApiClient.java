package com.diviso.payment.client.paypal.api;

import org.springframework.cloud.netflix.feign.FeignClient;


@FeignClient(name="paypal", url="${paypal.url:https://api.sandbox.paypal.com/v1}", configuration = PaypalConfiguration.class)
public interface PaypalApiClient extends PaypalApi {
}