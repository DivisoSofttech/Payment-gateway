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
import com.diviso.payment.client.ExcludeFromComponentScan;

@Configuration
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

	@Bean(name = "paypalOauth2RequestInterceptor")
	public RequestInterceptor oauth2FeignRequestInterceptor() {
		OAuth2FeignRequestInterceptor oauth2FeignRequestInterceptor = new OAuth2FeignRequestInterceptor(
				new DefaultOAuth2ClientContext(), resource());
		return oauth2FeignRequestInterceptor;
	}

	@Bean
	public OAuth2ProtectedResourceDetails resource() {
		ClientCredentialsResourceDetails details = new ClientCredentialsResourceDetails();
		details.setAccessTokenUri(accessTokenUri);
		details.setClientId(clientId);
		details.setClientSecret(clientSecret);
		details.setGrantType(grantType);
		return details;
	}

	@Bean
	Logger.Level feignLoggerLevel() {
		return Logger.Level.BASIC;
	}
}
