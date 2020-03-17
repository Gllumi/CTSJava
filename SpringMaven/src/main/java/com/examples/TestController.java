package com.examples;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("*/helloc")
	public String getMessage1() {
		return "hello";
	}
	
	@RequestMapping("/hi")
	public String getMessage2() {
		return "hello2";
	}
}
