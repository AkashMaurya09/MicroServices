package com.java.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service2")
public class service2 {
	@GetMapping("/mssg")
	public String service_2() {
		return "This is service 2";
	}

}
