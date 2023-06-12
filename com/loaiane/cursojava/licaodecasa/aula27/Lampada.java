package com.loaiane.cursojava.licaodecasa.aula27;

public class Lampada {

	String modelo;
	String tensão;
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
			System.out.println("Lâmpada está ligada ");
		} else {
			System.out.println("Lâmpada está desligada");
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
