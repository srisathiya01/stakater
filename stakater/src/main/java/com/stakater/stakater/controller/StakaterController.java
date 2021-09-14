package com.stakater.stakater.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StakaterController {
	@Value("${name}")
	private String name;

	/**
	 * To read value from property and return in api response	 * 
	 */
	@GetMapping(value="/greeting",produces="text/plain")
	public ResponseEntity<Object> greeting() {
		return ResponseEntity.status(HttpStatus.OK).body(String.format("Hello %s", name));		
	}
}
