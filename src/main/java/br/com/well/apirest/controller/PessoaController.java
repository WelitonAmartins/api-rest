package br.com.well.apirest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.well.apirest.entidade.Pessoa;
import br.com.well.apirest.service.PessoaService;
import br.com.well.apirest.vo.PessoaVO;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;
	
	@RequestMapping(value = "/{id}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PessoaVO> buscarPorId(@PathVariable("id") Long id) {
		return ResponseEntity.ok(this.pessoaService.buscarPorId(id));
	}
	
	@RequestMapping(value = "/salvar",
			method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PessoaVO> salvarPessoa(@Valid @RequestBody PessoaVO pessoa){
		return  ResponseEntity.ok(this.pessoaService.criarPessoa(pessoa));
	}
	
	
	@RequestMapping(value = "/deletar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deletarPessoa(@PathVariable Long id){
		this.pessoaService.deletarPessoa(id);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<PessoaVO>> buscarTodos() {
		return ResponseEntity.ok(this.pessoaService.buscarTodos());
	}

}
