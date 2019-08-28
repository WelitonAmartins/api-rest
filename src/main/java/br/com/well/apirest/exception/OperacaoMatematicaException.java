package br.com.well.apirest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class OperacaoMatematicaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public OperacaoMatematicaException(String exception) {
		super(exception);
	}
}
