package br.com.well.apirest.mapeamento;

import java.util.ArrayList;
import java.util.List;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

public class PessoaMapeamento {

	private static Mapper mapper = DozerBeanMapperBuilder.buildDefault();
	
	public static <O, D> D parseObject(O origem, Class<D> destino) {
		return mapper.map(origem, destino);
	}
	
	public static <O, D> List<D> parseListObject(List<O> origem, Class<D> destino) {
		List<D> destinoObjects = new ArrayList<D>();
		for (Object o : origem) {
			destinoObjects.add(mapper.map(o, destino));
			
		}
		return destinoObjects;
	}
}
