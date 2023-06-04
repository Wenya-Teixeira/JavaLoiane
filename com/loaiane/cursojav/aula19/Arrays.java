package com.loaiane.cursojav.aula19;

public class Arrays {

	public static void main(String[] args) {
		
		//Problema: Armazenar a temperatura m�dia di�ria por 1 ano
		
		//N�o � a solu��o:
		double temperaturaDiaria001 = 31.3;
		double temperaturaDiaria002 = 32;
		double temperaturaDiaria003 = 33.7;
		double temperaturaDiaria004 = 34;
		double temperaturaDiaria005 = 33.1;
		
		//quando se cria um Array, independente do seu tipo(double, int...), o valor inicial � igual a 0
		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 33.1;
		
		System.out.println("O valor da temperatura do dia 1 �: " + temperaturas[0]);
		
		//Tamanho do Array, quantos numeros cabem ali
		System.out.println("Qual � o tamanho do Array: " + temperaturas.length);
		
		//Endere�o de memoria que o Array est� apontando
		/*System.out.println("Valores do array: " + temperaturas);*/
		
		//pode-se utilizar outro loop, mas o for � o mais utilizado
		for (int i=0; i<temperaturas.length; i++) {
			System.out.println("O valor da temperatura do dia " + (i+1) + " �: " + temperaturas[i]);
		}
		
		//for melhorado --> no entanto s� temos os valores, sem o indice(i)
		for (double temp : temperaturas) {
			System.out.println(temp);
		}

	}

}
