package com.loaiane.cursojav.aula50;

public class ExceptionGenerica {

	public static void main(String[] args) {

		int[] numeros = { 4, 8, 16, 32, 68, 128 };
		int[] denominadores = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i] / denominadores[i]));
			//Devemos colcoar de forma mais generica a devolução dos erros:
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}

		}
	}

}
