package com.loaiane.cursojava.licaodecasa.aula19;

import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Entre com o valor da posi��o: " + i);
			vetorA[i] = s.nextInt();

			vetorB[i] = vetorA[i] * i;
		}

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
	}

}
