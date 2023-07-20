package com.loaiane.cursojav.aula49;

public class TestandoFinaly {

	public static void main(String[] args) {

		int[] numeros = { 4, 8, 16, 32, 68, 128 };
		int[] denominadores = { 2, 0, 4, 8, 0 };

		// Podemos colcoar o try dentro do for
		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i] / denominadores[i]));
			} catch (ArithmeticException e) {
				System.out.println("Erro ao dividir por 0");
			}
			// Quando n�o sabemos qual exce��o usar:
			catch (Throwable e) {
				System.out.println("Ocorreu um erro");
//De acordo com nosso exemplo o finally SEMPRE ser� executado.
			} finally {
				System.out.println("Essa linha � impressa sempre ap�s o try ou catch");

			}

		}

	}

}
