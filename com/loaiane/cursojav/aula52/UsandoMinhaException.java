package com.loaiane.cursojav.aula52;

public class UsandoMinhaException {

	public static void main(String[] args) throws Exception {

		int[] numeros = { 4, 8, 5, 16, 32, 21, 68, 128 };
		int[] denominadores = { 2, 0, 4, 8, 0, 2, 4 };

		for (int i = 0; i < numeros.length; i++) {
			try {
				if(numeros[i] % 2 != 0) {
					//lançar a exception aqui
					throw new DivisãoNaoExata(numeros[i], denominadores[i]);
				}
				System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i] / denominadores[i]));
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisãoNaoExata e) {
				System.out.println("Aconteceu um erro");
				e.printStackTrace();
			} 

		}

	}

}
