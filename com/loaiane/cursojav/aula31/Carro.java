package com.loaiane.cursojav.aula31;

//Quando é default, ele só é visivel dentro do proprio pacote
class Carro {

	String marca;
	String modelo;
	int numPassageiro;
	double capCombustivel;
	double consumoCombustivel;

	public void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + "km");
	}

	public double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado.");

		return capCombustivel * consumoCombustivel;
	}

	private double divideKmPorConsumoCombustivel(double km) {
		return this.calcularCombustivel(km);
	}
	
	public double calcularCombustivel(double km) {

		double quantidadeCombustivel = km / consumoCombustivel;

		return quantidadeCombustivel;
	}

}
