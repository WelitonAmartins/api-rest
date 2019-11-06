package br.com.well.apirest.mapeamento;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.well.apirest.entidade.Pessoa;

import br.com.well.apirest.mocks.MockPessoa;
import br.com.well.apirest.vo.PessoaVO;

public class PessoaMapeamentoTest {

		MockPessoa inputObject;

	    @Before
	    public void setUp() {
	        inputObject = new MockPessoa();
	    }

	    @Test
	    public void parseEntityToVOTest() {
	        PessoaVO output = PessoaMapeamento.parseObject(inputObject.mockEntity(), PessoaVO.class);
	        Assert.assertEquals(Long.valueOf(0L), output.getId());
	        Assert.assertEquals("First Name Test0", output.getPrimeiroNome());
	        Assert.assertEquals("Last Name Test0", output.getUltimoNome());
	        Assert.assertEquals("Addres Test0", output.getEndereco());
	        Assert.assertEquals("Male", output.getGenero());
	    }

	    @Test
	    public void parseEntityListToVOListTest() {
	        List<PessoaVO> outputList = PessoaMapeamento.parseListObject(inputObject.mockEntityList(), PessoaVO.class);
	        PessoaVO outputZero = outputList.get(0);
	        
	        Assert.assertEquals(Long.valueOf(0L), outputZero.getId());
	        Assert.assertEquals("First Name Test0", outputZero.getPrimeiroNome());
	        Assert.assertEquals("Last Name Test0", outputZero.getUltimoNome());
	        Assert.assertEquals("Addres Test0", outputZero.getEndereco());
	        Assert.assertEquals("Male", outputZero.getGenero());
	        
	        PessoaVO outputSeven = outputList.get(7);
	        
	        Assert.assertEquals(Long.valueOf(7L), outputSeven.getId());
	        Assert.assertEquals("First Name Test7", outputSeven.getPrimeiroNome());
	        Assert.assertEquals("Last Name Test7", outputSeven.getUltimoNome());
	        Assert.assertEquals("Addres Test7", outputSeven.getEndereco());
	        Assert.assertEquals("Female", outputSeven.getGenero());
	        
	        PessoaVO outputTwelve = outputList.get(12);
	        
	        Assert.assertEquals(Long.valueOf(12L), outputTwelve.getId());
	        Assert.assertEquals("First Name Test12", outputTwelve.getPrimeiroNome());
	        Assert.assertEquals("Last Name Test12", outputTwelve.getUltimoNome());
	        Assert.assertEquals("Addres Test12", outputTwelve.getEndereco());
	        Assert.assertEquals("Male", outputTwelve.getGenero());
	    }

	    @Test
	    public void parseVOToEntityTest() {
	        Pessoa output = PessoaMapeamento.parseObject(inputObject.mockVO(), Pessoa.class);
	        Assert.assertEquals(Long.valueOf(0L), output.getId());
	        Assert.assertEquals("First Name Test0", output.getPrimeiroNome());
	        Assert.assertEquals("Last Name Test0", output.getUltimoNome());
	        Assert.assertEquals("Addres Test0", output.getEndereco());
	        Assert.assertEquals("Male", output.getGenero());
	    }

	    @Test
	    public void parserVOListToEntityListTest() {
	        List<Pessoa> outputList = PessoaMapeamento.parseListObject(inputObject.mockVOList(), Pessoa.class);
	        Pessoa outputZero = outputList.get(0);
	        
	        Assert.assertEquals(Long.valueOf(0L), outputZero.getId());
	        Assert.assertEquals("First Name Test0", outputZero.getPrimeiroNome());
	        Assert.assertEquals("Last Name Test0", outputZero.getUltimoNome());
	        Assert.assertEquals("Addres Test0", outputZero.getEndereco());
	        Assert.assertEquals("Male", outputZero.getGenero());
	        
	        Pessoa outputSeven = outputList.get(7);
	        
	        Assert.assertEquals(Long.valueOf(7L), outputSeven.getId());
	        Assert.assertEquals("First Name Test7", outputSeven.getPrimeiroNome());
	        Assert.assertEquals("Last Name Test7", outputSeven.getUltimoNome());
	        Assert.assertEquals("Addres Test7", outputSeven.getEndereco());
	        Assert.assertEquals("Female", outputSeven.getGenero());
	        
	        Pessoa outputTwelve = outputList.get(12);
	        
	        Assert.assertEquals(Long.valueOf(12L), outputTwelve.getId());
	        Assert.assertEquals("First Name Test12", outputTwelve.getPrimeiroNome());
	        Assert.assertEquals("Last Name Test12", outputTwelve.getUltimoNome());
	        Assert.assertEquals("Addres Test12", outputTwelve.getEndereco());
	        Assert.assertEquals("Male", outputTwelve.getGenero());
	    }
}
