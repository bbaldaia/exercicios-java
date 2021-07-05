package br.com.generation.ex;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int multiploTres = 0;
		int valor, media;
		int soma = 0;
		
		do {
			
			System.out.println("Digite um valor: ");
			valor = input.nextInt();
			
			if (valor % 3 == 0 && valor != 0) {
				multiploTres += 1;
				soma += valor;
			}			
			
		} while (valor != 0);
		
		media = soma / multiploTres;
		System.out.println("Números múltiplos de 3: " + multiploTres);
		System.out.println("Soma dos valores múltiplos de 3: " + soma);
		System.out.println("Média dos valores múltiplos de 3: " + media);
		
		input.close();

	}

}
