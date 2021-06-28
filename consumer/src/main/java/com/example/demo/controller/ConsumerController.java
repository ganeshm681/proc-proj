package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.consumerDeatils;

@RestController
public class ConsumerController {


	
	public List<consumerDeatils> getAllDetails(){
		
	return Arrays.asList(new consumerDeatils("consumer1","998898998","consumer1@gmail.com"),
			new consumerDeatils("consumer2","998898997","consumer2@gmail.com"),
			new consumerDeatils("consumer3","998898996","consumer3@gmail.com"));	
	}
  	
	
}
