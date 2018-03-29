package com.diviso.payment.client.paypal;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import feign.RequestInterceptor;

@Configuration
public class PaypalOauth2InterceptedFeignConfiguration {
	@Bean(name= "oauth2RequestInterceptor")
    public RequestInterceptor getOAuth2RequestInterceptor() throws IOException {
        return new PaypalTokenRelayRequestInterceptor();
    }
}
