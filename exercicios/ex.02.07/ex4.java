package br.com.generation.aula02;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Digite um valor: ");
		valor = entrada.nextInt();
		
		if (valor % 2 == 0) {
			System.out.println();
			System.out.println("Par!");
			System.out.println("A raiz quadrada de " + valor + " é: " + Math.sqrt(valor));
		} else if (valor % 2 == 1) {
			System.out.println();
			System.out.println("Ímpar!");
			System.out.println(valor + " elevado ao quadrado é: " + Math.pow(valor, 2));
		}

	}

}
