package com.deivid.marvel_api.controller;

import static org.springframework.http.HttpStatus.OK;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.deivid.marvel_api.model.ComicsResponse;
import com.deivid.marvel_api.service.MarvelServiceImpl;

@RestController
@RequestMapping(value = "marvel")
public class MarvelController {

   	private MarvelServiceImpl service;

	public MarvelController(MarvelServiceImpl service) {
		this.service = service;
	}

	@ResponseStatus(OK)
	@GetMapping("/comics")
	public ComicsResponse findAll() {
		return service.findAll();
	}

}
