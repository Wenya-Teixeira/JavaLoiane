package com.loaiane.cursojava.aula16;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {

		int i = 1; // coun ou cont
		int max = 10;

		System.out.println("Contando at�: " + max);

		while (i <= max) {
			System.out.println("Valor de i= " + i);
			i++; // i = i + 1; ou 1 += 1;
		}
		// ele se mantem no loop, at� i ser maior que 10(o valor maximo)
		System.out.println(i);

		//no do-while, primeiro ele excuta e depois, ele avalia a express�o, caso ela seja falsa
		//ele n�o volta no fa�a(do)
		do {
			i++;
			System.out.println("Valor de i= " + i);
		} while (i < 11);

		System.out.println(i);
	}

}
