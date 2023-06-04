package com.loaiane.cursojava.licaodecasa.aula13;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Digite o primeiro numero sendo inteiro: ");
		int numero1 = s.nextInt();
		
		System.out.println("Digite o segundo numero sendo inteiro: ");
		int numero2 = s.nextInt();
		
		System.out.println("Digite o terceiro numero sendo real: ");
		double numero3 = s.nextDouble();
		
		int soma1 = (numero1 * 2) * (numero2 / 2);
		double soma2 = (numero1 * 3) + numero3;
		double soma3 = Math.pow(numero3, 3);
		
		
		System.out.println("Resultado1 = " + soma1 + " Resultado2 = " + soma2 + " Resultado3 = " + soma3);

	}

}
