package com.provider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.provider.model.InfoProvider;
import com.provider.service.InfoService;

@RestController
@RequestMapping("/info")
public class InfoController {

	private static final Logger LOG = LoggerFactory.getLogger(InfoController.class);

	@Autowired
	private InfoService infoService;
	
	@RequestMapping("/{state}")
	public InfoProvider getStateInfo(@PathVariable String state) {
		LOG.info("State information: {}", state);
		return infoService.getStateInfo(state);
	}
	
}