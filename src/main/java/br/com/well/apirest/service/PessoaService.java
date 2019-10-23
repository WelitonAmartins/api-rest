package br.com.well.apirest.service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.well.apirest.entidade.Pessoa;

@Service
public class PessoaService {
	
	//simular um id do banco de dados
	private final AtomicLong count = new AtomicLong();
	
	public Pessoa buscarPorId(String id) {
		Pessoa pessoa = new Pessoa(count.incrementAndGet(), "Weliton", "Martins", "Batatas", "Masculino");
		return pessoa;
	}

}
