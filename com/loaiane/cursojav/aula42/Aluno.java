package com.loaiane.cursojav.aula42;

public class Aluno {

	private String cursos[];
	private double notas[][];

	public Aluno() {
		super();
	}

	public Aluno(String nome, String endereco, String telefone, String curso) {
		//super(nome, endereco, telefone);
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

	public String obterEtiquetaEndereco() {
		String s = "Endereço do Aluno:";
		//s += super.getEndereco();
		return s;

	}

}
