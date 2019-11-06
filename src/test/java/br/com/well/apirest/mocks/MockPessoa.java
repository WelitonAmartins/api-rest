package br.com.well.apirest.mocks;

import java.util.ArrayList;
import java.util.List;

import br.com.well.apirest.entidade.Pessoa;
import br.com.well.apirest.vo.PessoaVO;

public class MockPessoa {
	
	 public Pessoa mockEntity() {
	    	return mockEntity(0);
	    }
	    
	    public PessoaVO mockVO() {
	    	return mockVO(0);
	    }
	    
	    public List<Pessoa> mockEntityList() {
	        List<Pessoa> Pessoas = new ArrayList<Pessoa>();
	        for (int i = 0; i < 14; i++) {
	            Pessoas.add(mockEntity(i));
	        }
	        return Pessoas;
	    }

	    public List<PessoaVO> mockVOList() {
	        List<PessoaVO> Pessoas = new ArrayList<>();
	        for (int i = 0; i < 14; i++) {
	            Pessoas.add(mockVO(i));
	        }
	        return Pessoas;
	    }
	    
	    private Pessoa mockEntity(Integer number) {
	    	Pessoa Pessoa = new Pessoa();
	    	Pessoa.setEndereco("Addres Test" + number);
	        Pessoa.setPrimeiroNome("First Name Test" + number);
	        Pessoa.setGenero(((number % 2)==0) ? "Male" : "Female");
	        Pessoa.setId(number.longValue());
	        Pessoa.setUltimoNome("Last Name Test" + number);
	        return Pessoa;
	    }

	    private PessoaVO mockVO(Integer number) {
	    	PessoaVO Pessoa = new PessoaVO();
	    	Pessoa.setEndereco("Addres Test" + number);
	        Pessoa.setPrimeiroNome("First Name Test" + number);
	        Pessoa.setGenero(((number % 2)==0) ? "Male" : "Female");
	        Pessoa.setId(number.longValue());
	        Pessoa.setUltimoNome("Last Name Test" + number);
	        return Pessoa;
	    }


}
