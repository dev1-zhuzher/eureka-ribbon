package com.vanke.ribbon.controller.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vanke.ribbon.service.RibbonService;

@RestController
public class RibbonController {

	
	@Autowired
	RibbonService ribbonService;
	
	@RequestMapping(value="/admin")
	public String hi(){
		return ribbonService.hiService();
	}
}
