package com.loaiane.cursojava.licaodecasa.aula13;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		System.out.println("Qual o tamanho do arquivo?");
		double tamArquivo = s.nextDouble();
		
		System.out.println("Qual a velocidade da internet?");
		double velInternet = s.nextDouble();
		
		double tempo = tamArquivo / velInternet;
		
		System.out.println("Tempo download: " + tempo);
		
	}

}
