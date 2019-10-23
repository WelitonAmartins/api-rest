package br.com.well.apirest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.well.apirest.business.OperacoesMatematica;
import br.com.well.apirest.exception.OperacaoMatematicaException;
import br.com.well.apirest.util.ConverterNumero;

@RestController 
public class MatematicaController {

	@Autowired
	private OperacoesMatematica pm;
	
	@RequestMapping(value="/sum/{primeiroValor}/{segundoValor}", method=RequestMethod.GET)
	public Double sum(@PathVariable("primeiroValor") String primeiroValor, @PathVariable("segundoValor") String segundoValor) throws Exception{
		if(!ConverterNumero.verificaSeENumerico(primeiroValor) || !ConverterNumero.verificaSeENumerico(segundoValor)) {
			throw new OperacaoMatematicaException("Por favor setar um valor numerico");
		}
		return pm.soma( ConverterNumero.convertDouble(primeiroValor), ConverterNumero.convertDouble(segundoValor));
	}
	
	@RequestMapping(value="/sub/{primeiroValor}/{segundoValor}", method=RequestMethod.GET)
	public Double subtracao(@PathVariable("primeiroValor") String primeiroValor, @PathVariable("segundoValor") String segundoValor) throws Exception {
		if(!ConverterNumero.verificaSeENumerico(primeiroValor) || !ConverterNumero.verificaSeENumerico(segundoValor)) {
			throw new OperacaoMatematicaException("Por favor setar um valor numerico");
		}
		return pm.subtracao(ConverterNumero.convertDouble(primeiroValor), ConverterNumero.convertDouble(segundoValor));
	}
	
	@RequestMapping(value="/mult/{primeiroValor}/{segundoValor}", method=RequestMethod.GET)
	public Double multiplicacao(@PathVariable("primeiroValor") String primeiroValor, @PathVariable("segundoValor") String segundoValor) throws Exception {
		if(!ConverterNumero.verificaSeENumerico(primeiroValor) || !ConverterNumero.verificaSeENumerico(segundoValor)) {
			throw new OperacaoMatematicaException("Por favor setar um valor numerico");
		}
		return pm.mutiplicacao(ConverterNumero.convertDouble(primeiroValor), ConverterNumero.convertDouble(segundoValor));
	}
	
	@RequestMapping(value="/div/{primeiroValor}/{segundoValor}", method=RequestMethod.GET)
	public Double divisao(@PathVariable("primeiroValor") String primeiroValor, @PathVariable("segundoValor") String segundoValor) throws Exception {
		if(!ConverterNumero.verificaSeENumerico(primeiroValor) || !ConverterNumero.verificaSeENumerico(segundoValor)) {
			throw new OperacaoMatematicaException("Por favor setar um valor numerico");
		}
		return pm.divisao(ConverterNumero.convertDouble(primeiroValor), ConverterNumero.convertDouble(segundoValor));
	}
	
	@RequestMapping(value="/media/{primeiroValor}/{segundoValor}", method=RequestMethod.GET)
	public Double media(@PathVariable("primeiroValor") String primeiroValor, @PathVariable("segundoValor") String segundoValor) throws Exception {
		if(!ConverterNumero.verificaSeENumerico(primeiroValor) || !ConverterNumero.verificaSeENumerico(segundoValor)) {
			throw new OperacaoMatematicaException("Por favor setar um valor numerico");
		}
		return pm.media(ConverterNumero.convertDouble(primeiroValor), ConverterNumero.convertDouble(segundoValor));
	}
	
	@RequestMapping(value="/raiz/{valor}", method=RequestMethod.GET)
	public Double raizQuadrada(@PathVariable("valor") String valor) throws Exception {
		if(!ConverterNumero.verificaSeENumerico(valor)) {
			throw new OperacaoMatematicaException("Por favor setar um valor numerico");
		}
		return pm.raizQuadrada(ConverterNumero.convertDouble(valor));
	}

	
	
}
