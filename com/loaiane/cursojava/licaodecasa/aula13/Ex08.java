package com.loaiane.cursojava.licaodecasa.aula13;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Quanto voc� ganham por hora?");
		double valorHora = s.nextDouble();

		System.out.println("Quantas horas voc� trabalha no m�s?");
		double horas = s.nextDouble();

		double salario = valorHora * horas;

		System.out.println("Seu salario  � igual: " + salario);

	}

}
