package com.loaiane.cursojava.licaodecasa.aula13;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o lado do quadrado: ");
		
		double lado = s.nextDouble();
		//areaQ = lado * lado
		double areaQ = Math.pow(lado, 2);
		
		System.out.println("A area do quadrado é = " + areaQ);

		System.out.println("O dobro da area do quadrado é = " + (areaQ * 2));

	}

}
