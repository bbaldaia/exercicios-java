package br.com.generation.testes;

import java.util.Scanner;

public class lacoCondicionalEscolhaCaso {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double numero1, numero2;
		double resultado = 0.0;
		char operacao;
		
		System.out.println("Digite o primeiro n�mero: ");
		numero1 = entrada.nextDouble();
		//Pega o primeiro n�mero
		
		System.out.println("Digite a opera��o: ");
		operacao = entrada.next().charAt(0);
		
		System.out.println("Digite o 2� n�mero: ");
		numero2 = entrada.nextDouble();
		
		switch (operacao) {
		case '+':
			resultado = numero1 + numero2;
			break;
		case '-':
			resultado = numero1 - numero2;
			break;
		case '*':
			resultado = numero1 * numero2;
			break;
		case '/':
			resultado = numero1 / numero2;
			break;
		default:
			System.out.println("Opera��o inv�lida!");	
		}
		
		System.out.println("Resultado: " + resultado);
		
		entrada.close();
		
	}

}
