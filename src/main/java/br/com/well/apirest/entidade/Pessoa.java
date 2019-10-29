package br.com.well.apirest.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pessoa")
public class Pessoa implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "primero_nome", nullable = false, length = 80)
	private String primeiroNome;
	
	@Column(name = "ultimo_nome", nullable = false, length = 80)
	private String ultimoNome;
	
	@Column(name = "endereco", nullable = false, length = 200)
	private String endereco;
	
	@Column(name = "genero", nullable = false, length = 10)
	private String genero;
}
