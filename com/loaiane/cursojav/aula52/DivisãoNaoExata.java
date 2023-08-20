package com.loaiane.cursojav.aula52;

public class Divis�oNaoExata extends Exception{
	
	private int num;
	private int denominador;
	
	public Divis�oNaoExata(int num, int denominador) {
		super();
		this.num = num;
		this.denominador = denominador;
	}

	@Override
	public String toString() {
		return "Resultado de " + num + "/" + denominador + " n�o � um inteiro!";
	}
	
	

}
