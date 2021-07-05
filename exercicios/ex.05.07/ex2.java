package br.com.generation.ex;

public class ex2 {

	public static void main(String[] args) {
		
		int i;
		int contaPar = 0;
		int contaImpar = 0;
		
		for (i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				contaPar += 1;
			} else if (i % 2 == 1) {
				contaImpar += 1;
			}
		}
		System.out.println("Total de " + contaPar + " números pares e " + contaImpar + " números ímpares.");
	}

}
