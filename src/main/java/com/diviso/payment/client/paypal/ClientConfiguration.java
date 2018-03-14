package com.diviso.payment.client.paypal;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;


import feign.Logger;
import feign.RequestInterceptor;
import org.springframework.cloud.security.oauth2.client.feign.OAuth2FeignRequestInterceptor;

import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

import com.diviso.payment.client.ExcludeFromComponentScan;


@Configuration
@EnableOAuth2Client
@ExcludeFromComponentScan
public class ClientConfiguration {
	
	 
	@Value("${security.oauth2.paypal.access-token-uri}")
	private String accessTokenUri;

	@Value("${security.oauth2.paypal.client-id}")
	private String clientId;

	@Value("${security.oauth2.paypal.client-secret}")
	private String clientSecret;

	@Value("${security.oauth2.paypal.grantType}")
	private String grantType;

	@Bean
	public RequestInterceptor oauth2FeignRequestInterceptor() {
		return new OAuth2FeignRequestInterceptor(new DefaultOAuth2ClientContext(), resource());
	}

	public OAuth2ProtectedResourceDetails resource() {
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+accessTokenUri);
		ClientCredentialsResourceDetails details = new ClientCredentialsResourceDetails();
		details.setAccessTokenUri(accessTokenUri);
		details.setClientId(clientId);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+clientId);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+grantType);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+clientSecret);
		details.setClientSecret(clientSecret);
		details.setGrantType(grantType);
		return details;
	}

	@Bean
	Logger.Level feignLoggerLevel() {
		return Logger.Level.BASIC;
	}
}
