package org.khazar.gateway.controller;

import org.khazar.gateway.model.response.FallbackResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallbackController {

    @GetMapping("/productServiceFallback")
    public FallbackResponse productServiceFallback() {
        return new FallbackResponse("product service is down");
    }

    @GetMapping("/orderServiceFallback")
    public FallbackResponse orderServiceFallback() {
        return new FallbackResponse("order service is down");
    }

    @GetMapping("/paymentServiceFallback")
    public FallbackResponse paymentServiceFallback() {
        return new FallbackResponse("payment service is down");
    }
}
