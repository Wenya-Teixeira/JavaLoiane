package com.loaiane.cursojav.aula42;

//Classe final não pode ser estendida
public class TesteEscola {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		// Pessoa aluno = new Aluno();
		// Pessoa professor = new Professor();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		//exemplo 2 = Constantes
		System.out.println(Constantes.URL_BLOG);

	}

}
