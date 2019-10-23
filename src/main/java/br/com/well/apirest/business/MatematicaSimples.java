package br.com.well.apirest.business;

import org.springframework.stereotype.Component;

@Component
public class MatematicaSimples {
	
	public Double soma(Double primeiroValor, Double segundoValor) {
        return primeiroValor + segundoValor;
    }

    public Double subtracao(Double primeiroValor, Double segundoValor) {
        return primeiroValor - segundoValor;
    }

    public Double mutiplicacao(Double primeiroValor, Double segundoValor) {
        return primeiroValor * segundoValor;
    }

    public Double divisao(Double primeiroValor, Double segundoValor) {
        return primeiroValor / segundoValor;
    }

    public Double media(Double primeiroValor, Double segundoValor) {
        return (primeiroValor + segundoValor) / 2;
    }
    
    public Double raizQuadrada(Double valor) {
        return (Double) Math.sqrt(valor);
    }

}
