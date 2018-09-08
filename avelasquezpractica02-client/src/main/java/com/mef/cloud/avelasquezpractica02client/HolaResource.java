package com.mef.cloud.avelasquezpractica02client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/hola/client")
public class HolaResource {
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping
	@RequestMapping ("/{id}")
	
	public String hola(@PathVariable("id") String id) {
		String url ="http://localhost:8071/rest/hola/server"+id;
		return restTemplate.getForObject(url,String.class);
	}
	

}
