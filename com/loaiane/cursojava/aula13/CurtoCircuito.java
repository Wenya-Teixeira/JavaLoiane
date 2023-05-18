package com.loaiane.cursojava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
		
		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso & verdadeiro;
		//esse && é conehcido como E curto circuito, verificou o primeiro, é falso, não continua
		boolean resultado2 = falso && verdadeiro;
		System.out.println(resultado1);
		System.out.println(resultado2);
		
		//Ordem de precedencia
		int resultado = 1 + 1 - 1 +1 * 1 / 1; 
		System.out.println(resultado);

	}

}
