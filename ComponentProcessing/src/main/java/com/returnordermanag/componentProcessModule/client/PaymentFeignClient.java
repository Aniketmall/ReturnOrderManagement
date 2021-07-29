package com.returnordermanag.componentProcessModule.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient(name="paymentFeignClient", url="localhost:8086/card/")

public interface PaymentFeignClient {
	@GetMapping(value = "/{cardNumber}/{charge}")
	double getCurrentBalance(@PathVariable long cardNumber,@PathVariable double charge);
}
