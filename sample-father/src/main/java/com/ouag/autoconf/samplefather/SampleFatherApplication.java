package com.ouag.autoconf.samplefather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@SpringBootConfiguration
@EnableAutoConfiguration
public class SampleFatherApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleFatherApplication.class, args);
	}

}
