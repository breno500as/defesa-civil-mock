package com.puc.defesa.civil.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mineradora-alerta-barragem")
public class MineradoraAlertaBarragemController {

	@PostMapping(consumes = "application/json")
	public String notificacaoAlerta(@RequestBody String informacaoJSON) {
        System.out.println(informacaoJSON);
		return "ok";
	}

}
