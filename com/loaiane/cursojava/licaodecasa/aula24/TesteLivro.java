package com.loaiane.cursojava.licaodecasa.aula24;

public class TesteLivro {

	public static void main(String[] args) {
		
		Ex_02_Livro livro = new Ex_02_Livro();
		livro.nomeLivro = "ABC";
		livro.nomeAutor = "Escola";
		livro.anoCriacao = 2022;
		livro.isbn = "ASDF";
		livro.paginas = 350;
		
		System.out.println("Nome do livro: " + livro.nomeLivro + " do " + livro.nomeAutor);

	}

}
