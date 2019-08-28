package br.com.well.apirest.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.well.apirest.exception.OperacaoMatematicaException;

@RestController 
public class MatematicaController {

	
	@RequestMapping(value="/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception{
		if(!verificaSeENumerico(numberOne) || !verificaSeENumerico(numberTwo)) {
			throw new OperacaoMatematicaException("Por favor setar um valor numerico");
		}
		
		Double sum = convertDouble(numberOne) + convertDouble(numberTwo); 
		return sum;
	}
	
	@RequestMapping(value="/sub/{primeiroValor}/{segundoValor}", method=RequestMethod.GET)
	public Double subtracao(@PathVariable("primeiroValor") String primeiroValor, @PathVariable("segundoValor") String segundoValor) throws Exception {
		if(!verificaSeENumerico(primeiroValor) || !verificaSeENumerico(segundoValor)) {
			throw new OperacaoMatematicaException("Por favor setar um valor numerico");
		}
		Double subtracao = convertDouble(primeiroValor) - convertDouble(segundoValor);
		return subtracao;
	}
	
	@RequestMapping(value="/mult/{primeiroValor}/{segundoValor}", method=RequestMethod.GET)
	public Double multiplicacao(@PathVariable("primeiroValor") String primeiroValor, @PathVariable("segundoValor") String segundoValor) throws Exception {
		if(!verificaSeENumerico(primeiroValor) || !verificaSeENumerico(segundoValor)) {
			throw new OperacaoMatematicaException("Por favor setar um valor numerico");
		}
		Double subtracao = convertDouble(primeiroValor) * convertDouble(segundoValor);
		return subtracao;
	}
	
	@RequestMapping(value="/div/{primeiroValor}/{segundoValor}", method=RequestMethod.GET)
	public Double divisao(@PathVariable("primeiroValor") String primeiroValor, @PathVariable("segundoValor") String segundoValor) throws Exception {
		if(!verificaSeENumerico(primeiroValor) || !verificaSeENumerico(segundoValor)) {
			throw new OperacaoMatematicaException("Por favor setar um valor numerico");
		}
		Double subtracao = convertDouble(primeiroValor) / convertDouble(segundoValor);
		return subtracao;
	}
	
	@RequestMapping(value="/media/{primeiroValor}/{segundoValor}", method=RequestMethod.GET)
	public Double media(@PathVariable("primeiroValor") String primeiroValor, @PathVariable("segundoValor") String segundoValor) throws Exception {
		if(!verificaSeENumerico(primeiroValor) || !verificaSeENumerico(segundoValor)) {
			throw new OperacaoMatematicaException("Por favor setar um valor numerico");
		}
		Double subtracao = (convertDouble(primeiroValor) + convertDouble(segundoValor)) / 2 ;
		return subtracao;
	}
	
	@RequestMapping(value="/raiz/{valor}", method=RequestMethod.GET)
	public Double raizQuadrada(@PathVariable("valor") String valor) throws Exception {
		if(!verificaSeENumerico(valor)) {
			throw new OperacaoMatematicaException("Por favor setar um valor numerico");
		}
		Double subtracao = (Double) Math.sqrt(convertDouble(valor));
		return subtracao;
	}

	private Double convertDouble(String strNumber) {
		if(strNumber == null) return 0D;
		String number = strNumber.replaceAll(",", ".");
		if(verificaSeENumerico(number)) return Double.parseDouble(number);
		return 0D;
	}

	private boolean verificaSeENumerico(String strNumber) {
		if(strNumber == null) return false;
								//subistitua todos as virgulas por ponto 
		String number = strNumber.replaceAll(",", ".");
	//regex qe verifica se é um numero
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
	
}
