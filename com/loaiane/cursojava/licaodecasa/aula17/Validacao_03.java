package com.loaiane.cursojava.licaodecasa.aula17;

import java.util.Scanner;

public class Validacao_03 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		boolean infoValida = false;
		String nome, sexo, estadoCivil;
		int idade;
		double salario;

		do {
			System.out.println("Digite um nome: ");

			nome = s.next();
			// o lenght informa uqantos caracteres
			if (nome.length() >= 3) {
				infoValida = true;
			} else {
				System.out.println("Nome precisa de no minimo 3 caracteres.");
			}
			// ele recebe o "!" na frente para negar, pois estamos fazendo ao contrario. na
			// linha 11 a
			// infoValida recebe false, quando se torna true com false, se torna uma negação
		} while (!infoValida);

		// Estamos utilizando o reuso de variaveis
		infoValida = false;

		do {
			System.out.println("Digite sua idade: ");

			idade = s.nextInt();

			if (idade >= 0 && idade <= 150) {
				infoValida = true;
			} else {
				System.out.println("Idade precisa ser entre 0 e 150.");
			}
		} while (!infoValida);

		infoValida = false;

		do {
			System.out.println("Digite seu sálario: R$ ");

			salario = s.nextDouble();

			if (salario > 0) {
				infoValida = true;
			} else {
				System.out.println("Seu sálario precisa ser maior que R$0.");
			}
		} while (!infoValida);

		infoValida = false;

		do {
			System.out.println("Digite seu sexo ");

			sexo = s.next();

			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				infoValida = true;
			} else {
				System.out.println("Seu sexo precisa ser 'f' ou 'm'.");
			}
		} while (!infoValida);

		infoValida = false;

		do {
			System.out.println("Digite seu estado civil ");

			estadoCivil = s.next();

			if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
					|| estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
				infoValida = true;
			} else {
				System.out.println("Seu estado civil precisa ser 's', 'c', 'v' ou 'd'.");
			}
		} while (!infoValida);

		System.out.println("Todas suas informações estão validadas:\n Nome: " + 
		                       nome + "\n Idade: " + idade + "\n Sálario R$" + salario + " reais "+ "\n Sexo: " + sexo +
		                       "\n Estado Civil: " + estadoCivil);
	}

}
