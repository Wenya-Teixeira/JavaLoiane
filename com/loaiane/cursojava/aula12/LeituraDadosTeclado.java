package com.loaiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.print("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome:");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é: " + primeiroNome);

		System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Digite a sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura é: " + altura);*/
		
		System.out.println("Digite o seu primeiro nome, idade e altura: ");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		double altura = scan.nextDouble();
		System.out.println("Seu primeiro nome é:" + primeiroNome + " \n sua idade:  " + idade + "\n e altura: " + altura);
	}

}
