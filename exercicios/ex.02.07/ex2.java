package br.com.generation.aula02;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double valor1, valor2, valor3, aux;
		
		System.out.println("Primeiro valor: ");
		valor1 = entrada.nextDouble();
		
		System.out.println("Segundo valor: ");
		valor2 = entrada.nextDouble();
		
		System.out.println("Terceiro valor: ");
		valor3 = entrada.nextDouble();
		
		if (valor1 > valor2) {
			//Valor 1 vira 20 e valor 2 vira 30
			aux = valor1;
			valor1 = valor2;
			valor2 = aux;
			
		}
		
		if (valor2 > valor3) {
			// Valor 2 vira 10 e valor 3 vira 30
			aux = valor2;
			valor2 = valor3;
			valor3 = aux;			
		}
		
		if (valor1 > valor2) {
			//Valor 1 vira 10 e valor 2 vira 20
			aux = valor1;
			valor1 = valor2;
			valor2 = aux;
			
		}
				
		System.out.println(valor1 + ", " + valor2 + ", " + valor3);
		
		entrada.close();
		
	}

}
