package com.loaiane.cursojava.licaodecasa.aula13;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Qual a temperatura em celsius?");

		double temperaturaC = s.nextDouble();

		double temperaturaF = temperaturaC * 1.8 + 32 ;

		System.out.println("A temperatura " + temperaturaC + " C é igual a " + temperaturaF + " f");

	}

}
