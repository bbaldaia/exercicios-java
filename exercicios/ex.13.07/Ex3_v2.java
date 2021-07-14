package ex;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3_v2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Jogos> estoque = new ArrayList<>();
		int numeroDeJogosAdicionados;	
		String resposta;
		int indiceParaRemover;
				
		System.out.println("Quantos jogos voc� deseja armazenar?");
		numeroDeJogosAdicionados = input.nextInt();
		System.out.println("=====");
		
		for (int i = 0; i < numeroDeJogosAdicionados; i++) {
			
			System.out.println("Qual jogo voc� deseja adicionar?");
			String jogoAdicionado = input.next();
			input.nextLine();
			
			System.out.println("Para qual console � este jogo?");
			String consoleAdicionado = input.nextLine();
			
			estoque.add(new Jogos(jogoAdicionado, consoleAdicionado));
			System.out.println("=====");			
		}
		
		for (Jogos i: estoque) {
			System.out.println(i);
		}
		
		System.out.println("=====");
		System.out.println("Voc� deseja remover algum jogo do estoque?");
		resposta = input.next();
						
		if (resposta.equals("sim")) {
			System.out.println("Digite o �ndice do jogo que voc� quer remover.");
			indiceParaRemover = input.nextInt();
			estoque.remove(indiceParaRemover);	
			System.out.println("=====");
			
			for (Jogos i: estoque) {
				System.out.println(i);
			}
			
			System.out.println("=====");
		} 
		
		System.out.println("Deseja adicionar algum jogo novo? ");
		resposta = input.next();
		
		if (resposta.equals("sim")) {
			
			System.out.println("Qual jogo voc� deseja adicionar?");
			String jogoAdicionado = input.next();
			input.nextLine();
			
			System.out.println("Para qual console � este jogo?");
			String consoleAdicionado = input.nextLine();
			System.out.println("=====");
			
			estoque.add(new Jogos(jogoAdicionado, consoleAdicionado));
			
			for (Jogos i: estoque) {
				System.out.println(i);
			}
			
			System.out.println("=====");
		} 		
		
		System.out.println("Obrigado pelas informa��es!");
		input.close();
	}

}
