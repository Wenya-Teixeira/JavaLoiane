package com.loaiane.cursojava.licaodecasa.aula13;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		System.out.println("Qual a temperatura e Farenheit?");
		
		//Converter Farenheit em celsius = (5 * (F-32) /9)
		
		double temperaturaF = s.nextDouble();
		
		double temperaturaC = (5 * (temperaturaF - 32) / 9);
		
		System.out.println("Em graus celsius sua temperatura é de: " + temperaturaC + "C");

	}

}
