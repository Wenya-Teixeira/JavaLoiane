package com.loaiane.cursojava.licaodecasa.aula13;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite dois numeros: ");
		
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		
		int soma = numero1 + numero2;
		
		System.out.println("A soma dos numeros é igual: " + soma);

	}

}
