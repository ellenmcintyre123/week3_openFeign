package atu.ie.week3_openfeign;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.cloud.openfeign.FeignClient(name = "product-service", url = "http://localhost:8082")
public interface FeignClient {
    @PostMapping("/confirm")
    String someDetails(@RequestBody Product product);
}
