package com.loaiane.cursojava.licaodecasa.aula13;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite as sua 4 notas do bimestre: ");
		
		double nota1 = s.nextDouble();
		double nota2 = s.nextDouble();
		double nota3 = s.nextDouble();
		double nota4 = s.nextDouble();
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Sua média do bimestre é igual: " + media);

	}

}
