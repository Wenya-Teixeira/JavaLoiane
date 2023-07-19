package com.loaiane.cursojav.aula47;

public class Excecao {

	public static void main(String[] args) {

		try {
			int[] vetor = new int[4];

			System.out.println("Antes da exception");
			// Gera erro, pq o valo 4 não existe, vetores começam com 0
			vetor[4] = 1;

			System.out.println("Esse texto, não será impresso");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exceção ao acessar um índice do vetor que não existe");
		}
		System.out.println("Esse texto será impresso após a exception");

	}

}
