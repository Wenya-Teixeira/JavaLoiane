package com.loaiane.cursojava.licaodecasa.aula27;

public class Lampada {

	String modelo;
	String tens�o;
	int potencia;
	String cor;
	int garantiaMeses;
	String[] tipos;
	boolean tipoAbajur;

	boolean ligada;

	void ligar() {
		ligada = true;
	}

	void desligar() {
		ligada = false;
	}

	void mostrarEstado() {
		if (ligada) {
			System.out.println("L�mpada est� ligada ");
		} else {
			System.out.println("L�mpada est� desligada");
		}
	}
	
	void mudarEstado() {
		if(ligada) {
			desligar();
		}else {
			ligar();
		}
	}

}
