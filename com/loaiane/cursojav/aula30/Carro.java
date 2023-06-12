package com.loaiane.cursojav.aula30;

//Utilizando a palavra this, ele referencia atributos e metodos da própria classe
public class Carro {

	String marca;
	String modelo;
	int numPassageiro;
	double capCombustivel;
	double consumoCombustivel;

	public Carro() {

	}

	public Carro(String marca, String modelo, int numPassageiro, double capCombustivel, double consumoCombustivel) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiro = numPassageiro;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public Carro(String marca, String modelo, int numPassageiro) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiro = numPassageiro;
		System.out.println("Chamando construtor com 3 parâmetros");
	}

	public Carro(String marca, String modelo) {
		this(marca, modelo, 5);
		System.out.println("Chamando construtor com 2 parâmetros");
	}
//podemos usar a palavra this, também em metodos
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + "km");
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
