package ex1;

import java.util.Scanner;

public class teste {

	//Classe principal
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Pegando os atributos das classes criadas
		dadosCavalo cavalo = new dadosCavalo();
		dadosCachorro cachorro = new dadosCachorro();
		dadosPreguiça preguiça = new dadosPreguiça();
		
		//Imputando valores para cada objeto
		cavalo.setNome("Billy");
		cavalo.setIdade(10);
		cavalo.setSom("iiirrrrí");
		cavalo.setAcao("correr");
		cavalo.setPatas(4);
		
		cachorro.setNome("Bolt");
		cachorro.setIdade(5);
		cachorro.setSom("au au");
		cachorro.setAcao("correr");
		cachorro.setPatas(4);
		cachorro.setRaçaCanina("vira-lata caramelo");
		
		preguiça.setNome("Flash");
		preguiça.setIdade(8);
		preguiça.setSom("zZzZZz");
		preguiça.setAcao("subir em árvores");
		preguiça.setPatas(2);
		preguiça.setAlimentacao("folhas");		
		
		//Imprimindo tudo
		System.out.println("Nome do cavalo: " + cavalo.getNome());
		System.out.println("Idade do cavalo: " + cavalo.getIdade());
		System.out.println("Som do cavalo: " + cavalo.getSom());
		System.out.println("Ação do cavalo: " + cavalo.getAcao());
		System.out.println("Número de patas do cavalo: " + cavalo.getPatas());
		System.out.println();
		
		System.out.println("Nome do cachorro: " + cachorro.getNome());
		System.out.println("Idade do cachorro: " + cachorro.getIdade());
		System.out.println("Som do cachorro: " + cachorro.getSom());
		System.out.println("Ação do cachorro: " + cachorro.getAcao());
		System.out.println("Número de patas do cachorro: " + cachorro.getPatas());
		System.out.println("Raça do cachorro: " + cachorro.getRaçaCanina());
		System.out.println();
		
		System.out.println("Nome do bicho-preguiça: " + preguiça.getNome());
		System.out.println("Idade do bicho-preguiça: " + preguiça.getIdade());
		System.out.println("Som do bicho-preguiça: " + preguiça.getSom());
		System.out.println("Ação do bicho-preguiça: " + preguiça.getAcao());
		System.out.println("Número de patas do bicho-preguiça: " + preguiça.getPatas());
		System.out.println("Alimentação do bicho-preguiça: " + preguiça.getAlimentacao());		
		
		input.close();

	}

}
