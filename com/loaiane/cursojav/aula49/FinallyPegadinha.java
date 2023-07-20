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
				//Ao terminar execu��o do programa dentro do try ou catch, fanally N�O � executado.
				System.exit(0);
//De acordo com nosso exemplo o finally SEMPRE ser� executado.
			} finally {
				System.out.println("Essa linha � impressa sempre ap�s o try ou catch");

			}
		}

	}

}
