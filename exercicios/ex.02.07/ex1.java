package br.com.generation.aula02;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int valor, maior = 0;
		int i;
		
		for (i = 0; i < 3; i++) {
			System.out.println("Digite um valor: ");
			valor = entrada.nextInt();
			
			if (valor > maior) {
				maior = valor;
			}
			
		}
		
		System.out.println("O maior valor digitado foi: " + maior);
		
		entrada.close();

	}

}
