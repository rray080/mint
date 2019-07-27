package com.gtids.mint;
//By Rakesh
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MintApplication {
	public static final String BASE_URI = "/mint/v1";
	public static void main(String[] args) {
		SpringApplication.run(MintApplication.class, args);
	}

}
