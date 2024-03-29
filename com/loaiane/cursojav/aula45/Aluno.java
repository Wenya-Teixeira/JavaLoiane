package com.loaiane.cursojav.aula45;

public class Aluno extends Pessoa {

	private String cursos[];
	private double notas[][];

	public Aluno() {
		super();
	}

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

	//Aqui eu estou sobrepondo o metodo da classe Pessoa com modificações
	public String obterEtiquetaEndereco() {
		String s = "Endereço do Aluno:";
		s += super.getEndereco();
		return s;

		// return endereco;
	}

}
