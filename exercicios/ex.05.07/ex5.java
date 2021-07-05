package br.com.generation.ex;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numero = -1;
		int soma = 0;
		
		do {
			
			System.out.println("Digite um número: ");
			numero = input.nextInt();		
			soma += numero;
			
		} while (numero != 0);
		
		System.out.println("Soma de todos os valores: " + soma);
		input.close();
		
	}

}
