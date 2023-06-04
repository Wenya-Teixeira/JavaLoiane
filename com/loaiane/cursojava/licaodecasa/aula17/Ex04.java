package com.loaiane.cursojava.licaodecasa.aula17;

public class Ex04 {

	public static void main(String[] args) {

		int populacaoA = 80000;
		int populacaoB = 200000;
		int cont = 0;

		while (populacaoA < populacaoB) {

			populacaoA += (populacaoA / 100) * 3;
			populacaoB += (populacaoB / 100) * 1.5;
			cont++;
		}

		System.out.println("A população A é igual: " + populacaoA);
		System.out.println("A população B é igual: " + populacaoB);
		System.out.println("quantidade de anos: " + cont);

	}

}
