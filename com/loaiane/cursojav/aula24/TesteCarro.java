package com.loaiane.cursojav.aula24;

public class TesteCarro {

	public static void main(String[] args) {
		
		//Criação de objetos: van é um tipo de carro
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiro = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		//System.out.println(van); Aqui ele passa oq está alocado na memoria

	}

}
