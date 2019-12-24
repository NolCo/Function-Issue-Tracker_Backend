package com.nolco.fit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FitController {
	@RequestMapping(value="/")
	@ResponseBody
	public String main() {
		return "Welcome to FIT";
	}
}
