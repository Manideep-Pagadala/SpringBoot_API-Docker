package com.boot.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/welcome/{name}")
	public String getWelcomeMsg(@PathVariable String name) {
		return "Hero wants " + name;
	}

}
