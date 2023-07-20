package com.loaiane.cursojav.aula49;

public class FinallyPegadinha {

	public static void main(String[] args) {

		int[] numeros = { 4, 8, 16, 32, 68, 128 };
		int[] denominadores = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i] / denominadores[i]));
			} catch (ArithmeticException e) {
				System.out.println("Erro ao dividir por 0");
				System.exit(0);
			}
			catch (Throwable e) {
				System.out.println("Ocorreu um erro");
				//Ao terminar execução do programa dentro do try ou catch, fanally NÃO é executado.
				System.exit(0);
//De acordo com nosso exemplo o finally SEMPRE será executado.
			} finally {
				System.out.println("Essa linha é impressa sempre após o try ou catch");

			}
		}

	}

}
