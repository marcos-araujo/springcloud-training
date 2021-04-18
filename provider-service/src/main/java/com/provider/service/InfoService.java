package com.provider.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.provider.model.InfoProvider;
import com.provider.repository.InfoRepository;

@Service
public class InfoService {

	@Autowired
	private InfoRepository infoRepository;
	
	public InfoProvider getStateInfo(String state) {
		return infoRepository.findByState(state);
	}
	
}
