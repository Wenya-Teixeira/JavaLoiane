package com.loaiane.cursojava.licaodecasa.aula20;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[][] numeros = new int[3][3];

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {

				System.out.println("Entre com o valor da posição [" + i + "," + j + "]");
				numeros[i][j] = s.nextInt();
			}
		}

		int quantidadePares = 0;
		int quantidadeImpares = 0;
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {

				if (numeros[i][j] % 2 == 0) {
					quantidadePares++;
				}else {
					quantidadeImpares++;
				}
			}
		}
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Pares = " + quantidadePares);
		System.out.println("Impares = " + quantidadeImpares);
	}

}
