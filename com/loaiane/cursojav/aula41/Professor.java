package com.loaiane.cursojav.aula41;

public class Professor extends Pessoa {

	private String departamento;
	private String nomeCursos;
	private double salario;

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getNomeCursos() {
		return nomeCursos;
	}

	public void setNomeCursos(String nomeCursos) {
		this.nomeCursos = nomeCursos;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double calculaSalarioLiquido() {
		return 0;
	}

	public String obterEtiquetaEndereco() {
		String s = "Endereço do Professor:";
		s += super.getEndereco();
		return s;

	}

}
