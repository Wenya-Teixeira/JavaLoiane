package com.loaiane.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.print("Entre com sua idade: ");
		
		int idade = scan.nextInt();
		
		if(idade >= 18) {
			System.out.println("Voc� � maior de idade");
		} else {
			System.out.println("Sinto muito, mas voc� � menor de idade");
		}*/
		
		//Pre�o do item barato: tem que ser <= 10 reais
		//se for estiver entre 10 e 15, voc� pode pedir desconto
		//se estiver entre 15 e 17, melhor pesquisar mais
		//se estiver >= 17 - muito caro
		
		System.out.print("Entre com o pre�o do item: ");
		double valor = scan.nextDouble();
		
		if (valor <= 10) {
			System.out.println("Item barato, pode levar");
		} else if ( valor > 10 && valor < 15) {
			System.out.println("Pe�a um desconto");
		}else if (valor >= 15 && valor < 17) {
			System.out.println("Pesquise mais");
		} else {
			System.out.println("Muito caro!");
		}

	}

}
