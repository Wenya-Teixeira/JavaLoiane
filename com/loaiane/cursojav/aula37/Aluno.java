package com.loaiane.cursojav.aula37;

import com.loaiane.cursojav.aula36.Pessoa;

public class Aluno extends Pessoa {

	private String cursos[];
	private double notas[][];

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
