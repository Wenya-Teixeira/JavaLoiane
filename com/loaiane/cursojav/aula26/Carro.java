package com.loaiane.cursojav.aula26;

public class Carro {
	
	
	String marca;
	String modelo;
	int numPassageiro;
	double capCombustivel;
	double consumoCombustivel;
	
	//declarando um metodo:
	//nomes de metodos sempre começam com verbo
	//começamos um metodo com seu tipo de rotorno, nesse caso ele será vazio(void)
	//Esse é um metodo simples: sem retorno e/ou parametro
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");
	}
	
	//O tipo de dado que vamos retornar(double-nesse caso)
	//Esse metodo possui retorno
	double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado.");
		//O return sempre fica ao fim do metodo
		return capCombustivel * consumoCombustivel;
	}

}
