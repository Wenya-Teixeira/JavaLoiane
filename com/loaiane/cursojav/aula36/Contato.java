package com.loaiane.cursojav.aula36;

public class Contato {

	private String nome;
	private Endereco enderco; //declara��o tem um � simples 
	private Telefone[] telefones; //declara��o um para varios tem array

	public Contato() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEnderco() {
		return enderco;
	}

	public void setEnderco(Endereco enderco) {
		this.enderco = enderco;
	}

	public Telefone[] getTelefones() {
		return telefones;
	}

	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}

}
