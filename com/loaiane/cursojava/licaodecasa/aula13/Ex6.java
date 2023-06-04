package com.loaiane.cursojava.licaodecasa.aula13;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//area ciruclo = pi * raio ao quadrado
		
		System.out.println("Digite o raio do circulo: ");
		
		double raio = s.nextDouble();
		
		//double areaC = Math.PI * raio * raio;
		//ou
		double areaC = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A area do circulo é = " + areaC);

	}

}
