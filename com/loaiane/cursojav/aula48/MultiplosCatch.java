package com.loaiane.cursojav.aula48;

public class MultiplosCatch {

	public static void main(String[] args) {

		int[] numeros = { 4, 8, 16, 32, 68, 128 };
		int[] denominadores = { 2, 0, 4, 8, 0 };

		// Podemos colcoar o try dentro do for
		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i] / denominadores[i]));
			} catch (ArithmeticException e) {
				System.out.println("Erro ao dividir por 0");

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Posição do array inválida");
			}

		}

	}

}
