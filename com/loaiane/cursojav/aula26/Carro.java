package com.loaiane.cursojav.aula26;

public class Carro {
	
	
	String marca;
	String modelo;
	int numPassageiro;
	double capCombustivel;
	double consumoCombustivel;
	
	//declarando um metodo:
	//nomes de metodos sempre come�am com verbo
	//come�amos um metodo com seu tipo de rotorno, nesse caso ele ser� vazio(void)
	//Esse � um metodo simples: sem retorno e/ou parametro
	void exibirAutonomia() {
		System.out.println("A autonomia do carro �: " + capCombustivel * consumoCombustivel + "km");
	}
	
	//O tipo de dado que vamos retornar(double-nesse caso)
	//Esse metodo possui retorno
	double obterAutonomia() {
		System.out.println("M�todo obterAutonomia foi chamado.");
		//O return sempre fica ao fim do metodo
		return capCombustivel * consumoCombustivel;
	}

}
