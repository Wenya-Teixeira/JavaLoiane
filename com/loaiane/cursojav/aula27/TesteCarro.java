package com.loaiane.cursojav.aula27;

import com.loaiane.cursojav.aula27.Carro;

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

		double autonomia = van.obterAutonomia();
		System.out.println("A autonomia do carro �: " + autonomia);
		// ou
		System.out.println("A autonomia do carro �: " + van.obterAutonomia());
		
		//O que passamos dentro do parentese � o resultado do parametro da classe Carro
		double quantideCombustivel10 = van.calcularCombustivel(10);
		double quantideCombustivel15 = van.calcularCombustivel(15);
		
		System.out.println("A quantidade de combustivel = " + quantideCombustivel10);
		System.out.println("A quantidade de combustivel = " + quantideCombustivel15);
	}
}
