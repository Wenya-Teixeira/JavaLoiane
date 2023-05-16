package com.loaiane.cursojava.aula10;

public class Varivaies {

	public static void main(String[] args) {
		// convenção Java
		int idade = 20;
		String name;
		String nomeDoCachorro;

		// aceito, mas não utilizado
		int _idade;
		int $idade;

		// não é convenção Java
		String nome_do_meu_cachorro;
		String NomeDoCachorro;
		String nomeDocachorro;

		// má prática: não sabe oq significa o nome da variavekl
		int a = 10;
		String b = "Wenya";

		idade = 25;

		System.out.println("Idade = " + idade);

	}

}
