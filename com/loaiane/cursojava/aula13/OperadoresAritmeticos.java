package com.loaiane.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println(resultado);
		
		String primeiroNome = "Esta �";
		String segundoNome = " uma string concatenada";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		
		//o ++ adiciona 1 oq ocorre tbm com o sinal de --
		resultado = resultado ++;
		System.out.println(resultado);
		
		//5
		System.out.println(resultado++);
		//mesma coisa que:
		//System.out.println(resultado);
		//resultado = resultado +1;
		//resultado += 1;

		System.out.println(++resultado);
		//mesma coisa que:
		//resultado += 1;
		//System.out.println(resultado);
		
	}

}
