package com.loaiane.cursojav.aula37;

import com.loaiane.cursojav.aula36.Pessoa;

public class TesteEscola {

	public static void main(String[] args) {

		//tenho acesso as informações da pessoa e do aluno ou professor
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		//tenho acesso somente as informações da pessoa
		Pessoa aluna = new Aluno();
		Pessoa professora = new Pessoa();
		
	}

}
