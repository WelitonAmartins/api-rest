package br.com.well.apirest.service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.well.apirest.entidade.Pessoa;
import br.com.well.apirest.mapeamento.PessoaMapeamento;
import br.com.well.apirest.repository.PessoaRepository;
import br.com.well.apirest.vo.PessoaVO;

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
	
	public PessoaVO criarPessoa(PessoaVO entidade) {
		Pessoa entity = PessoaMapeamento.parseObject(entidade, Pessoa.class);
		PessoaVO vo = PessoaMapeamento.parseObject(this.pessoaRepository.save(entity), PessoaVO.class);
		return vo;
	}
	
	public PessoaVO buscarPorId(Long id) {
		Optional<Pessoa> entity = this.pessoaRepository.findById(id);
		return PessoaMapeamento.parseObject(entity, PessoaVO.class);
	}
	
	public void deletarPessoa(Long id) {
		 this.pessoaRepository.deleteById(id);
	}
	
	public List<PessoaVO> buscarTodos() {
		return PessoaMapeamento.parseListObject(this.pessoaRepository.findAll(), PessoaVO.class);
	
	}

}
