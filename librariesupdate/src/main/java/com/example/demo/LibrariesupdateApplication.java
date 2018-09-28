package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
@Transactional
public class LibrariesupdateApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibrariesupdateApplication.class, args);
	}
}
