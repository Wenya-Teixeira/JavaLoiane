package com.loaiane.cursojava.aula11;

public class CuriosidadeInt {

	public static void main(String[] args) {
		//Isso ocorre pq os numeros no Java funcioanm como uma roleta, no momento que pego o 
		//limite e somo alguma coisa, ele volta nos negativos;
		int var1 = 2147483647;
		
		long var2 = 1;
		
		System.out.println(var1 + var2);
		//resposta = -2147483648

	}

}
