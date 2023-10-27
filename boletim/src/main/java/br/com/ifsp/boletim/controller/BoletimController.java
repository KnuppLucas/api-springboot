package br.com.ifsp.boletim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifsp.boletim.model.NotaModel;
import br.com.ifsp.boletim.repository.NotaRepository;
import br.com.ifsp.boletim.service.BoletimService;

@RestController
@RequestMapping("boletim/api")
public class BoletimController {
	
	@Autowired
	private BoletimService boletimService;

	@GetMapping
	public List<NotaModel> retornaNotas() {
		return boletimService.retornaNotas();
	}
	
	@PostMapping
	public NotaModel registraNota(@RequestBody NotaModel novaNota) {
		return boletimService.registraNota(novaNota);
	}
}
