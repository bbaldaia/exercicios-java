package br.com.generation.testes;

import java.util.Scanner;

public class lacoCondicional {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = entrada.nextDouble();
		//Pega a primeira nota
		
		System.out.println("Digite a segunda nota: ");
		nota2 = entrada.nextDouble();
		//Pega a segunda nota
		
		media = (nota1 + nota2) / 2;
		
		if (media >= 6.0 ) {
			
			System.out.println("Aprovado!");
			System.out.println("Média: " + media);
			
		} else if (media >= 3.0 && media < 6) {
			
				System.out.println("Recuperação!");
				System.out.println("Média: " + media);
			
		} else {
			
			System.out.println("Reprovado!");
			System.out.println("Média: " + media);
			
		}
		
		entrada.close();
	}

}
