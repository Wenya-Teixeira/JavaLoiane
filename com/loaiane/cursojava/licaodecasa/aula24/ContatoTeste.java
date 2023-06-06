package com.loaiane.cursojava.licaodecasa.aula24;

public class ContatoTeste {

	public static void main(String[] args) {
		
		ContatoCelular contato = new ContatoCelular();
		
		contato.nome = "João";
		contato.endereço = "Rua 1023";
		contato.email = "joao10@gmail.com";
		
		contato.telefones = new String[5];
		contato.telefones[0] = "99999-9999";
		contato.telefones[1] = "99998-9999";
		contato.telefones[2] = "99998-7999";

	}

}
