package com.loaiane.cursojava.licaodecasa.aula17;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		boolean infoValidas = false;
		String nomeUser;
		String senha;
		
		do {
			System.out.println("Informe o nome do usuário: ");
			nomeUser = s.next();
			
			System.out.println("Entre com a senha: ");
			senha = s.next();
			
			//O equals representa igualdade e o IgnoreCase ignora quando se utiliza letras maiuscula
			if (nomeUser.equalsIgnoreCase(senha)) {
				//Opcional: infoValidas = false;
				System.out.println("Senha igual a usuário, digite novamente");
			} else {
				infoValidas = true;
				System.out.println("Senha e usuários válidos.");
			}
			
		}while (!infoValidas);
		

	}

}
