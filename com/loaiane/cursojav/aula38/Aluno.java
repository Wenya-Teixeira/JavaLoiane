package com.loaiane.cursojav.aula38;

public class Aluno extends Pessoa {

	private String cursos[];
	private double notas[][];

	// Criação de um construtor vazio utilizando a palavra super: em que ele chama o
	// construtor da super classe que seria nesse caso a classe Pessoa
	public Aluno() {
		super();
	}
//Aqui podemos passar os outros atributos que a classe Aluno possui
	//Utilizando o super, quando vamos realizar acesso a super classe
	//Enquanto o this será referencia a propria classe
	public Aluno(String nome, String endereco, String telefone, String curso) {
		super(nome, endereco, telefone);
		this.cursos = cursos;
	}

	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}

	public double[][] getNotas() {
		return notas;
	}

	public void setNotas(double[][] notas) {
		this.notas = notas;
	}

	public double calcularMedia() {
		return 0;
	}

	public boolean verificarAprovado() {
		return true;

	}

}
