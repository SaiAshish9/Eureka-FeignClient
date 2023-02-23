package com.sai.spring.eureaka.client.api.external;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "PAYMENT-SERVICE")
public interface PaymentService {

    @GetMapping("/payment-provider/payNow/{price}")
    String payNow(@PathVariable("price") int price);

}
