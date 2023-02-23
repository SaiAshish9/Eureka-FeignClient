package com.sai.spring.eureaka.client.api.controller;

import com.sai.spring.eureaka.client.api.external.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShoppingController {
	@Autowired
	private RestTemplate template;

	@Autowired
	private PaymentService paymentService;

	@GetMapping("/amazon-payment/{price}")
	public String invokePaymentService(@PathVariable int price) {
		String url = "http://PAYMENT-SERVICE/payment-provider/payNow/" + price;
//		return template.getForObject(url, String.class);
		return paymentService.payNow(price);
	}

}
