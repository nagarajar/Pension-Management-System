package com.cts.disbursepension.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * Feign Client which handles REST API calls to authorization microservice
 * 
 * @author Nagaraja
 *
 */
@FeignClient("AUTH-SERVICE")
public interface AuthorisationClient {

	/**
	 * method to validate JWT token
	 * 
	 * @param token
	 * @return true only if token is valid else false
	 * 
	 */
	@GetMapping("/validate")
	public boolean validate(@RequestHeader(name = "Authorization") String token);

}
