package br.com.well.apirest.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaVO implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long id;
	private String primeiroNome;
	private String ultimoNome;
	private String endereco;
	private String genero;
}
