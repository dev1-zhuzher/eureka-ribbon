package com.vanke.ribbon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vanke.ribbon.service.RibbonService;

@Service
public class RibbonServiceImpl implements RibbonService{

	@Autowired
    RestTemplate restTemplate;
	
	@Override
	public String hiService() {
		return restTemplate.getForObject("http://SERVICE-CLIENT/admin",String.class);
	}

}
