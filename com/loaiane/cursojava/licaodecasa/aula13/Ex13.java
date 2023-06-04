package com.loaiane.cursojava.licaodecasa.aula13;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Quanto você ganham por hora?");
		double valorHora = s.nextDouble();

		System.out.println("Quantas horas você trabalha no mês?");
		double horas = s.nextDouble();

		double salarioBruto = valorHora * horas;
		double inss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double ir = (salarioBruto / 100) * 11;
		double totalDescontos = inss + sindicato + ir;
		double salarioLiquido = salarioBruto - totalDescontos;

		System.out.println("Seu salario bruto : " + salarioBruto 
				+ "\n foi pago ao INSS: " + inss
				+ "\n para o sindicato: " + sindicato 
				+ "\n para IR: " + ir + "\n total de descontos: " + totalDescontos
				+ "\n seu salario liquido: " + salarioLiquido);

	}

}
