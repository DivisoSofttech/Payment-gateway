package com.diviso.payment.client.paypal.api;


import org.springframework.cloud.netflix.feign.FeignClient;

import com.diviso.payment.client.paypal.ClientConfiguration;

@FeignClient(name = "paypal", url = "${paypal.url:https://api.sandbox.paypal.com/v1}", configuration = ClientConfiguration.class)
public interface PaypalApiClient extends PaypalApi {

	
}