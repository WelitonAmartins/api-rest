package br.com.well.apirest.util;

public class ConverterNumero {
	
	public static Double convertDouble(String strNumber) {
		if(strNumber == null) return 0D;
		String number = strNumber.replaceAll(",", ".");
		if(verificaSeENumerico(number)) return Double.parseDouble(number);
		return 0D;
	}

	public static boolean verificaSeENumerico(String strNumber) {
		if(strNumber == null) return false;
								//subistitua todos as virgulas por ponto 
		String number = strNumber.replaceAll(",", ".");
	//regex qe verifica se é um numero
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
