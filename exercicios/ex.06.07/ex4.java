package Exercicios;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		int l, c;
		int [][] valor = new int [3][3];
		int somaDiagonal = 0, somaValores = 0;
		Scanner input = new Scanner(System.in);

		
		for (l = 0; l < 3; l++) {
			for (c = 0; c < 3; c++) {

				System.out.print("Digite um valor: ");
				valor[l][c] = input.nextInt();
				somaValores += valor[l][c];
				System.out.println();

				if (l == c) {
					somaDiagonal += valor[l][c];
				}
			}
		}

		System.out.println("A soma dos valores da diagonal é de: " + somaDiagonal);
		System.out.println("\nA soma de todos os valores é de: " + somaValores);		

	}

}
