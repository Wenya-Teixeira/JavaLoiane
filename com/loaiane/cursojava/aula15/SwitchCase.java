package com.loaiane.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escolha um dia na semana (1-7): ");
		
		int diaSemana = scan.nextInt();
		
		switch (diaSemana) {
		case 1: System.out.println("Domingo"); break;
		case 2: System.out.println("Segunda"); break;
		case 3: System.out.println("Ter�a"); break;
		case 4: System.out.println("Quarta"); break;
		case 5: System.out.println("Quinta"); break;
		case 6: System.out.println("Sexta"); break;
		case 7: System.out.println("S�bado"); break;
		default: System.out.println ("N�o existe esse dia");
		}
		
		//falando sobre o brak, ele funciona como fechar o parentese, se n�o tiver ele executa, todos os
		//0comandos, at� encontrar o break, mesmo se n�o for verdadeiro
		/*switch (diaSemana) {
		case 1: System.out.println("Domingo"); 
		case 2: System.out.println("Segunda"); 
		case 3: System.out.println("Ter�a"); 
		case 4: System.out.println("Quarta"); 
		case 5: System.out.println("Quinta"); 
		case 6: System.out.println("Sexta"); 
		case 7: System.out.println("S�bado"); 
		default: System.out.println ("N�o existe esse dia");
		}*/
		
		switch (diaSemana) {
		case 2:
		case 3: 
		case 4: 
		case 5: 
		case 6: System.out.println("Dia �til"); break;
		case 1: 
		case 7: System.out.println("Fim de semana"); break;
		default: System.out.println ("N�o existe esse dia");
		}
		
		
		

	}

}
