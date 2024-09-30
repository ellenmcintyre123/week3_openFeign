package atu.ie.week3_openfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Week3OpenFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(Week3OpenFeignApplication.class, args);
	}

}
