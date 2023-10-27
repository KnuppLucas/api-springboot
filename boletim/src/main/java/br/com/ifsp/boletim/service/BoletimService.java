package br.com.ifsp.boletim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifsp.boletim.model.NotaModel;
import br.com.ifsp.boletim.repository.NotaRepository;

@Service
public class BoletimService {

	@Autowired
	private NotaRepository notaRepository;

	public List<NotaModel> retornaNotas() {
		return notaRepository.findAll();
	}

	public NotaModel registraNota(NotaModel novaNota) {
		return notaRepository.save(novaNota);
	}
}
