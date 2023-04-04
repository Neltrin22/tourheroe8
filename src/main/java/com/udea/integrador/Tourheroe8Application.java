package com.udea.integrador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Tourheroe8Application {

	public static void main(String[] args) {
		SpringApplication.run(Tourheroe8Application.class, args);
	}

	@GetMapping("/hello")
	public String sayHello(@RequestParam(value="myName", defaultValue="Nelsin") String name){
		return String.format("Soy %s!", name);
	}

}
