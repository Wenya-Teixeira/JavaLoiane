package com.loaiane.cursojav.aula29;

public class Carro {

	String marca;
	String modelo;
	int numPassageiro;
	double capCombustivel;
	double consumoCombustivel;
	
	//Criando construtor
	public Carro() {
		System.out.println("Classe carro foi instanciada");
		numPassageiro = 4;
	}
	
	//Contrutor passando parametros
	Carro(String marca_, String modelo_, int numeroPassageiros_, double capacidadeCombustivel_, double consumoCombustivel_) {
		marca = marca_;
		modelo = modelo_;
		numPassageiro = numeroPassageiros_;
		capCombustivel = capacidadeCombustivel_;
		consumoCombustivel = consumoCombustivel_;
	}
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");
	}
	
	double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado.");

		return capCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {

		double quantidadeCombustivel = km / consumoCombustivel;
		
		return quantidadeCombustivel;
	}
	
}
