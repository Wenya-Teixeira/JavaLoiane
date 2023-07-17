package com.loaiane.cursojav.aula43;

import java.util.Arrays;
import java.util.Objects;

import javax.print.attribute.standard.MediaSize.Other;

public class Aluno {

	private String cursos;
	private double notas[];

	public Aluno() {
		super();
	}

	public Aluno(String nome, String endereco, String telefone, String curso) {
		// super(nome, endereco, telefone);
		this.cursos = cursos;
	}

	public String getCursos() {
		return cursos;
	}

	public void setCursos(String cursos) {
		this.cursos = cursos;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
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
		// s += super.getEndereco();
		return s;

	}

	//metodo toString = conseguimos retornar os valores
	@Override
	public String toString() {
		return "Aluno [cursos=" + cursos + ", notas=" + Arrays.toString(notas) + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		//isso pode ser trocado por, apenas uma das coisas que vai buscar, nesse caso, pelo curso, por exemplo :
		/*
		 * if(cursos.equalsIgnoreCase(getCursos())) { return true; } return false; }
		 */
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(cursos, other.cursos) && Arrays.equals(notas, other.notas);
	}
	
	

}
