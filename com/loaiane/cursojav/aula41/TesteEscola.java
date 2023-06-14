package com.loaiane.cursojav.aula41;

import com.loaiane.cursojav.aula40.Aluno;
import com.loaiane.cursojav.aula40.Pessoa;
import com.loaiane.cursojav.aula40.Professor;

public class TesteEscola {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa(); 
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();

		pessoa.setEndereco("Rua 1, num 1");
		aluno.setEndereco("Rua 2, num 2");
		professor.setEndereco("Rua 3, num 3");

	}

}
