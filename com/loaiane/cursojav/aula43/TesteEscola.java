package com.loaiane.cursojav.aula43;

public class TesteEscola {

	public static void main(String[] args) {
		// metodo toString
		Aluno aluno = new Aluno();

		aluno.setCursos("Sistemas de informação");
		double[] notas = { 10, 9, 8, 7 };
		aluno.setNotas(notas);

		System.out.println(aluno);

		// Isso me retorna um false, pois ele está comparando os dois o "==" quer dizer
		// que eles são iguais e nesse caso não
		String s1 = "asdffhggjghj";
		String s2 = "asdffhggsfgd";

		// esse pode ser substituido por: System.out.println(s1 == s2);
		// aqui retorna false
		System.out.println(s1.equalsIgnoreCase(s2));
		// ou
		System.out.println(s1.equals(s2));

		Aluno aluno2 = new Aluno();

		aluno2.setCursos("Sistemas de informação");
		double[] notas2 = { 10, 9, 6, 7 };
		aluno2.setNotas(notas2);

		//ele da false, pois, esse metodo equals compara os atributos
		System.out.println(aluno.equals(notas2));

	}

}
