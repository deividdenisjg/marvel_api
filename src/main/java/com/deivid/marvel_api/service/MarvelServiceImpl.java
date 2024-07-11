package com.deivid.marvel_api.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.deivid.marvel_api.model.ComicsResponse;
import com.deivid.marvel_api.repository.MarvelComicsClient;
import org.apache.commons.codec.digest.DigestUtils;

@Service
public class MarvelServiceImpl {
    
    private static final String PUBLIC_KEY = "0dd8f039cae7e6fec3b64d6a274a597a";
	private static final String PRIVATE_KEY = "9466bf070c6dab36fef4346cf706b935fe80831b";

	private MarvelComicsClient client;

	public MarvelServiceImpl(MarvelComicsClient client) {
		this.client = client;
	}

	public ComicsResponse findAll() {
		Long timeStamp = new Date().getTime();

		return client.getAll(timeStamp, PUBLIC_KEY, buildHash(timeStamp));
	}

	private String buildHash(Long timeStamp) {
		return DigestUtils.md5Hex(timeStamp + PRIVATE_KEY + PUBLIC_KEY);
	}

}
