package com.OCJA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OcjaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OcjaApplication.class, args);
		System.out.println("OCJA Application Starts here");

		int number  = 10;
		int Number  = 20;
		int Runnable = 30;

		System.out.println(number);
		System.out.println(Number);
		System.out.println(Runnable);
	}

}
