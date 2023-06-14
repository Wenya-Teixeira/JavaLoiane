package com.loaiane.cursojav.aula32;

public class Carro {
	//Encapsulamento:Com as variaveis em private, não conseguimos utilizar na em outra classe, então criamos os getters e setters
	private String marca;
	private String modelo;
	private int numPassageiro;
	private double capCombustivel;
	private double consumoCombustivel;
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumPassageiro() {
		return numPassageiro;
	}

	public void setNumPassageiro(int numPassageiro) {
		this.numPassageiro = numPassageiro;
	}

	public double getCapCombustivel() {
		return capCombustivel;
	}

	public void setCapCombustivel(double capCombustivel) {
		this.capCombustivel = capCombustivel;
	}

	public double getConsumoCombustivel() {
		return consumoCombustivel;
	}

	public void setConsumoCombustivel(double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}

}
