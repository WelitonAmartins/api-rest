package br.com.well.apirest.service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.well.apirest.entidade.Pessoa;
import br.com.well.apirest.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	//simular um id do banco de dados
	private final AtomicLong count = new AtomicLong();
	
	public Pessoa buscarPorId(String id) {
		Pessoa pessoa = new Pessoa(count.incrementAndGet(), "Weliton", "Martins", "Batatas", "Masculino");
		return pessoa;
	}
	
	public Pessoa criarPessoa(Pessoa entidade) {
		return this.pessoaRepository.save(entidade);
	}
	
	public Optional<Pessoa> buscarPorId(Long id) {
		return this.pessoaRepository.findById(id);
	}
	
	public void deletarPessoa(Long id) {
		 this.pessoaRepository.deleteById(id);
	}
	
	public List<Pessoa> buscarTodos() {
		return this.pessoaRepository.findAll();
	
	}

}
