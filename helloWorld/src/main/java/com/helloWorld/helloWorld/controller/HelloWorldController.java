package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloWorldController {
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!!!";
	}
	@GetMapping("/bsm")
	public String listaBsm() {
		return "Orientação ao futuro\r\n"
				+ "Responsabilidade Pessoal\r\n"
				+ "Mentalidade de crescimento\r\n"
				+ "Persistência\r\n"
				+ "Habilidade:\r\n"
				+ "Trabalho em equipe\r\n"
				+ "Atenção aos detalhes\r\n"
				+ "Proatividade\r\n"
				+ "Comunicação";
	}
      @GetMapping("/objetivo")
      public String listaObjetivo() {
    	  return "Habilidade Técnica\n"
    	  		+ "Atenção aos Detalhes";
    			  
    			  
      }
	
}
