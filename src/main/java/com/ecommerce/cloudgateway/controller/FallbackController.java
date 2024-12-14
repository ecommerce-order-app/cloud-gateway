package com.ecommerce.cloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
	
	@GetMapping("/order/fallback")
	public String orderServiceFallback() {
		return "Order service is down";
	}
	
	@GetMapping("/product/fallback")
	public String productServiceFallback() {
		return "Product service is down";
	}
	
	@GetMapping("/payment/fallback")
	public String paymentServiceFallback() {
		return "Payment service is down";
	}
}
