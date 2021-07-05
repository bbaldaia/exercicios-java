package br.com.generation.ex;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int idade = 0;
		int menor21 = 0;
		int maior50 = 0;
		
		while (idade != -99) {
			
			System.out.println("Digite a idade: ");
			idade = input.nextInt();			
			
			if (idade >= 1 && idade < 21) {
				menor21 += 1;
			} else if (idade > 50) {
				maior50 += 1;
			}
			
		}
		
		System.out.println("Pessoa com menos que 21 anos: " + menor21);
		System.out.println("Pessoas com mais que 50 anos: " + maior50);

	}

}
