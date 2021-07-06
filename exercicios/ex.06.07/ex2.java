package Exercicios;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		int [] dadoLancado = new int [10];
		int maiorPontuacao = 0, soma = 0;
		double mediaAritmetica;
		Scanner input = new Scanner(System.in); 
		
		for (int i = 0; i < dadoLancado.length; i++) {
			System.out.print((i + 1) + "º valor do dado: ");
			dadoLancado[i] = input.nextInt();
			
			//Somar todos os valores sorteados pelo dado lançado
			soma += dadoLancado[i];
			System.out.println();		
			
			//Salvar quantas vezes o dado teve 6 pontos
			if (dadoLancado[i] == 6) {
				maiorPontuacao += 1;
			}
		}
		mediaAritmetica = soma / 10;
		
		System.out.println("Média aritmética: " + mediaAritmetica);
		System.out.println("A maior pontuacão aconteceu " + maiorPontuacao + " vezes");
		
		input.close();

	}

}
