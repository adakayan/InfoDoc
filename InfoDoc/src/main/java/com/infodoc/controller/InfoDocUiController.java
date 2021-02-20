package com.infodoc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InfoDocUiController {

	@RequestMapping("/home")
	public String defectDetails() {
	    return "home";
	}
}
