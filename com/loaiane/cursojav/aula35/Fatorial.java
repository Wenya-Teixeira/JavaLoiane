package com.loaiane.cursojav.aula35;

public class Fatorial {
	//Metodo n�o recursivo
	public int calculaFatorial(int num) {
		int total = 1;
		for(int i=num; i>1; i--) {
			total *= 1;
		}
		return total;
	}
	
	//metodo recursivo
	public int fatorial(int num) {
		if(num == 0) { //e o if � nosso ponto de parada para n�o se tornar um loop infinito
			return 1;
		}
		return num * fatorial(num-1);//Chama ele mesmo no fatorial
	}

}
