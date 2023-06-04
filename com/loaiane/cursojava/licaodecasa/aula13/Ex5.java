package com.loaiane.cursojava.licaodecasa.aula13;

import java.util.Scanner;

public class Ex5 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de metros: ");
		double metros = s.nextDouble();
		
		//1 metro = 100cm
		double cm = metros * 100;
		
		System.out.println(metros + "m é igual a: " + cm + " centimetros");
	}

}
