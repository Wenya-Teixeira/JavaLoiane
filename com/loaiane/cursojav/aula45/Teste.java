package com.loaiane.cursojav.aula45;

public class Teste {

	public static void main(String[] args) {

//UPCASTING E DOWNCASTING
		/*
		 * Aluno aluno = new Aluno(); Pessoa pessoaAluno = aluno; // upcasting
		 * 
		 * Pessoa aluno2 = (Pessoa) new Aluno(); // upcasting
		 * 
		 * Pessoa aluno3 = new Pessoa(); Aluno aluno4 = (Aluno) aluno3;
		 */
//INSTANCEOF:
		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();

		if (pessoa instanceof Pessoa) {
			System.out.println("Objeto do tipo Pessoa");
		}

		if (aluno instanceof Aluno) {
			System.out.println("Objeto do tipo Aluno");
		}

		if (professor instanceof Professor) {
			System.out.println("Objeto do tipo Professor");
		}

	}

}
