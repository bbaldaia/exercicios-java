package Exercicios;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		double[] pontuacao = new double [5];
		Scanner input = new Scanner(System.in);
		double maior = 0;
		
		
		
		for (int i = 0; i < pontuacao.length; i++) {
			
			//Solicitando a pontua��o
			System.out.println((i + 1) + "� pontua��o da atividade: ");
			pontuacao[i] = input.nextDouble();	
			
			//Salvar a maior pontua��o
			if (pontuacao[i] > maior) {
				maior = pontuacao[i];
			}
		}
		
		System.out.print("As notas foram: ");
		
		//Imprimir todas as pontua��es
		for (int i = 0; i < pontuacao.length; i++) {
			System.out.print(pontuacao[i] + " | ");			
		}
		
		System.out.println("\nA maior nota foi: " + maior);
		
		input.close();
	}

}
