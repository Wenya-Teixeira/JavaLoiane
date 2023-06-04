package com.loaiane.cursojava.licaodecasa.aula13;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		System.out.println("Qual a sua altura?");
		
		double altura = s.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("Seu peso ideal é igual a: " + pesoIdeal + " KG");

	}

}
