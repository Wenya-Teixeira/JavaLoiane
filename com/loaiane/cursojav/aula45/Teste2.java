package com.loaiane.cursojav.aula45;

public class Teste2 {

	public static void main(String[] args) {

		
		Object obj1 = obterString();
		String s1 = (String) obj1; 
		
		Object obj2 = "Minha String"; //upcasting
		String s2 = (String) obj2; //downcasting
		
		Object obj3 = new Object();
		String s3 = (String) obj3; //vai dar erro em tempo de execu��o
		
		Object obj4 = obterInteiro();
		String s4 = (String) obj4; //vai dar erro em tempo de execu��o
	}

	public static String obterString() {
		return "minha String";
	}
	
	public static int obterInteiro() {
		return 1;
	}

}
