package com.loaiane.cursojava.licaodecasa.aula17;

import java.util.Scanner;

public class Ex_05_Cont04 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		double populacaoA, populacaoB;
		double taxaCrescimentoA, taxaCrescimentoB;

		boolean valido = false;
		do {

			System.out.println("Entre com a popula��o A:");
			populacaoA = s.nextDouble();

			if (populacaoA > 0) {
				valido = true;
			} else {
				System.out.println("Popula��o A precisa ser maior que 0");
			}
		} while (!valido);

		valido = false;
		do {

			System.out.println("Entre com a popula��o B:");
			populacaoB = s.nextDouble();

			if (populacaoB > 0) {
				valido = true;
			} else {
				System.out.println("Popula��o B precisa ser maior que 0");
			}
		} while (!valido);
		
		valido = false;
		do {

			System.out.println("Entre com a taxa de crecimento da popula��o A:");
			taxaCrescimentoA = s.nextDouble();

			if (taxaCrescimentoA > 0) {
				valido = true;
			} else {
				System.out.println("A taxa de crecimento da popula��o A precisa ser maior que 0");
			}
		} while (!valido);
		
		valido = false;
		do {

			System.out.println("Entre com a taxa de crecimento da popula��o B:");
			taxaCrescimentoB = s.nextDouble();

			if (taxaCrescimentoB > 0) {
				valido = true;
			} else {
				System.out.println("A taxa de crecimento da popula��o B precisa ser maior que 0");
			}
		} while (!valido);
		
		int cont = 0;

		while (populacaoA < populacaoB) {

			populacaoA += (populacaoA / 100) * taxaCrescimentoA;
			populacaoB += (populacaoB / 100) * taxaCrescimentoB;
			cont++;
		}

		System.out.println("A popula��o A � igual: " + populacaoA);
		System.out.println("A popula��o B � igual: " + populacaoB);
		System.out.println("quantidade de anos: " + cont);

	}
}