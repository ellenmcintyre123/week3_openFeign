package atu.ie.week3_openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "PleaseWork", url = "http://localhost:8085/details")
public interface Communication {
@PostMapping("/confirm-details")
     String someDetails(Product product);

}
