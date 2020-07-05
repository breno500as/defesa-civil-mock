package com.puc.defesa.civil.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("alertas-barragem")
public class MineradoraAlertaBarragemController {

	@PostMapping(consumes = "application/json")
	public ResponseEntity<?> notificacaoAlerta(@RequestBody String informacaoJSON) {
		System.out.println(informacaoJSON);
		return ResponseEntity.noContent().build();
	}

}
