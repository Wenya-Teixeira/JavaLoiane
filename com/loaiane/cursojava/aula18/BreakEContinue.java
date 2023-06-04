package com.loaiane.cursojava.aula18;

import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		/*
		 *encontra os multiplos de 7
		 * System.out.println("Entre com um numero"); int num = s.nextInt();
		 * 
		 * System.out.println("Entre com um limite"); int max = s.nextInt();
		 * 
		 * for (int i = num; i <= max; i++) { System.out.println(i); if(i % 7 ==0) {
		 * System.out.println("O valor de i = " + i); break; } }
		 */

		System.out.println("Entre com um numero");
		int num = s.nextInt();

		System.out.println("Entre com um limite");
		int max = s.nextInt();
        //pula os multiplos de 7
		for (int i = num; i <= max; i++) {
			if (i % 7 == 0) {
				continue;
			}
			System.out.println("O valor de i = " + i);
			;
		}

	}

}
