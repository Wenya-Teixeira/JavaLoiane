package com.loaiane.cursojava.aula17;

public class ForVariaveis {

	public static void main(String[] args) {
		
		//for com mais de uma varivel
		
		for(int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i tem valor = " + i + " e j tem valor = " + j);
		}
		
		//for com partes ausentes
		int i3 = 0;
		for ( ; i3 < 10; ) {
			System.out.println("i tem valor= " + i3);
			i3 += 2;
		} //que é a mesma coisa de:
		for (int i2 = 0; i2 < 10; i2 += 2) {
			System.out.println("Valor de i = " + i2);
		}
		
		//loop infinito = for( ; ; );
		
		//loop sem corpo
		int soma = 0;
		for (int i = 1; i < 5; soma += i++ );
			System.out.println("O valor da soma é = soma " + soma);
		
		//smepre utilize as chaves{}
			

	}

}
