package com.loaiane.cursojava.licaodecasa.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[] vetorA = new int[15];
		//mudamos o tipo da varivel, por conta da raiz retornar numeros reais(double)
		double[] vetorB = new double[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Entre com o valor da posição: " + i);
			vetorA[i] = s.nextInt();

			vetorB[i] = Math.sqrt(vetorA[i]);
		}

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		//o '.' representa a quantidade de numeros apos a virgula
		DecimalFormat df = new DecimalFormat("###,###.###");

		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(df.format(vetorB[i]) + " ");
		}
	}

}
