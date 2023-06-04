package com.loaiane.cursojava.licaodecasa.aula17;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// utilizando flag

		boolean notaValida = false;

		do {

			System.out.println("Informe uma nota:");

			double nota = s.nextDouble();

			if (nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("A nota é: " + nota);
			} else {
				System.out.println("Sua nota é inválida!");
			}
		} while (!notaValida);
	}
}
