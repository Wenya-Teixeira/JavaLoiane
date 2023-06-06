package com.loaiane.cursojav.aula25;

import com.loaiane.cursojav.aula25.Carro;

public class TesteCarro {

	public static void main(String[] args) {

		// Cria��o de objetos: van � um tipo de carro

		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiro = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;

		System.out.println(van.marca);
		System.out.println(van.modelo);

		van.exibirAutonomia();
	}
}
