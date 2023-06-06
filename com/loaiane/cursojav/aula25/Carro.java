package com.loaiane.cursojav.aula25;

public class Carro {

	String marca;
	String modelo;
	int numPassageiro;
	double capCombustivel;
	double consumoCombustivel;

	// declarando um metodo:
	// nomes de metodos sempre começam com verbo
	// começamos um metodo com seu tipo de rotorno, nesse caso ele será vazio(void)
	// Esse é um metodo simples: sem retorno e/ou parametro
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");
	}

}
