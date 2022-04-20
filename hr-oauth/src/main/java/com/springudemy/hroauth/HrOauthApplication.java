package com.springudemy.hroauth;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class HrOauthApplication implements CommandLineRunner{

//	@Value("${hr-oauth.oauth.appname}")
//	private String appName;
//	
//	@Value("${hr-oauth.oauth.appsecret}")
//	private String appSecret;
//	
//	@Value("${hr-oauth.oauth.expiration}")
//	private int expiration;
	
	public static void main(String[] args) {
		SpringApplication.run(HrOauthApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("Appname = "+appName);
//		System.out.println("Appsecret = "+appSecret);
//		System.out.println("Expiration = "+expiration);
	}

}
