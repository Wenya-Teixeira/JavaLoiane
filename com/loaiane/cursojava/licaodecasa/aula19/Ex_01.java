package com.loaiane.cursojava.licaodecasa.aula19;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];

		// a utiliza��o do vetorA.length, nos permite alterar o valor desse vetor no
		// futuro
		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Entre com o valor da posi��o: " + i);
			vetorA[i] = s.nextInt();
			
			vetorB[i] = vetorA[i];
		}
		
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.print("Vetor B = ");
		for (int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
	}

}
