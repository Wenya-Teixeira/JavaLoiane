package com.loaiane.cursojava.licaodecasa.aula24;

public class TesteLampada {

	public static void main(String[] args) {
		
		
		Ex_01_Lampada lampada = new Ex_01_Lampada();
		lampada.modelo = "A60";
		lampada.tens�o = "Bivolt";
		lampada.garantiaMeses = 36;
		lampada.potencia = 7;
		lampada.cor = "Amarela";
		
		lampada.tipos = new String[5]; //Precisamos iniciar, extremamente importante
		lampada.tipos[0] = "Abajur";

	}

}
