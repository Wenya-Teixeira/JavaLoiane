package com.loaiane.cursojav.aula52;

public class DivisãoNaoExata extends Exception{
	
	private int num;
	private int denominador;
	
	public DivisãoNaoExata(int num, int denominador) {
		super();
		this.num = num;
		this.denominador = denominador;
	}

	@Override
	public String toString() {
		return "Resultado de " + num + "/" + denominador + " não é um inteiro!";
	}
	
	

}
