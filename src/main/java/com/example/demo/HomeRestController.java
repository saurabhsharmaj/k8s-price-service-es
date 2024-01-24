package com.example.demo;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {

	@Autowired
	private ElasticSearchQuery elasticSearchQuery;

	@GetMapping("/")
	public String getProcessDefinitions() {
		return "price-service-" + UUID.randomUUID().toString();
	}

	@GetMapping("/esdata")
	public ResponseEntity<Object> searchAllDocument() throws IOException {
		List<Student> products = elasticSearchQuery.searchAllDocuments();
		return new ResponseEntity<>(products, HttpStatus.OK);
	}

}
