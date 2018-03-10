package com.diviso.payment.client.paypal.api;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;

import feign.Logger;
import feign.RequestInterceptor;
import org.springframework.cloud.security.oauth2.client.feign.OAuth2FeignRequestInterceptor;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.token.grant.password.ResourceOwnerPasswordResourceDetails;


@Configuration
public class PaypalConfiguration {
	@Value("${security.oauth2.paypal.access-token-uri}")
    private String accessTokenUri;

    @Value("${security.oauth2.paypal.client-id}")
    private String clientId;

    @Value("${security.oauth2.paypal.client-secret}")
    private String clientSecret;

    /*@Value("${security.oauth2.paypal.scopes}")
    private List<String> scopes;*/
    
    @Value("${security.oauth2.paypal.username}")
    private String username;
    
    @Value("${security.oauth2.paypal.password}")
    private String password;
    
    @Value("${security.oauth2.paypal.grantType}")
    private String grantType;

    @Bean
    RequestInterceptor oauth2FeignRequestInterceptor() {
        return new OAuth2FeignRequestInterceptor(new DefaultOAuth2ClientContext(), resource());
    }

    OAuth2ProtectedResourceDetails resource() {
    	ResourceOwnerPasswordResourceDetails details = new ResourceOwnerPasswordResourceDetails();
        details.setAccessTokenUri(accessTokenUri); 
        details.setClientId(clientId);
        details.setClientSecret(clientSecret);
        //details.setScope(scopes);
        details.setUsername(username);
        details.setPassword(password);
        details.setGrantType(grantType);
        return details;
    }

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.BASIC;
    }
}


