package ex1;

import java.util.Scanner;

public class teste {

	//Classe principal
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Pegando os atributos das classes criadas
		dadosCavalo cavalo = new dadosCavalo();
		dadosCachorro cachorro = new dadosCachorro();
		dadosPregui�a pregui�a = new dadosPregui�a();
		
		//Imputando valores para cada objeto
		cavalo.setNome("Billy");
		cavalo.setIdade(10);
		cavalo.setSom("iiirrrr�");
		cavalo.setAcao("correr");
		cavalo.setPatas(4);
		
		cachorro.setNome("Bolt");
		cachorro.setIdade(5);
		cachorro.setSom("au au");
		cachorro.setAcao("correr");
		cachorro.setPatas(4);
		cachorro.setRa�aCanina("vira-lata caramelo");
		
		pregui�a.setNome("Flash");
		pregui�a.setIdade(8);
		pregui�a.setSom("zZzZZz");
		pregui�a.setAcao("subir em �rvores");
		pregui�a.setPatas(2);
		pregui�a.setAlimentacao("folhas");		
		
		//Imprimindo tudo
		System.out.println("Nome do cavalo: " + cavalo.getNome());
		System.out.println("Idade do cavalo: " + cavalo.getIdade());
		System.out.println("Som do cavalo: " + cavalo.getSom());
		System.out.println("A��o do cavalo: " + cavalo.getAcao());
		System.out.println("N�mero de patas do cavalo: " + cavalo.getPatas());
		System.out.println();
		
		System.out.println("Nome do cachorro: " + cachorro.getNome());
		System.out.println("Idade do cachorro: " + cachorro.getIdade());
		System.out.println("Som do cachorro: " + cachorro.getSom());
		System.out.println("A��o do cachorro: " + cachorro.getAcao());
		System.out.println("N�mero de patas do cachorro: " + cachorro.getPatas());
		System.out.println("Ra�a do cachorro: " + cachorro.getRa�aCanina());
		System.out.println();
		
		System.out.println("Nome do bicho-pregui�a: " + pregui�a.getNome());
		System.out.println("Idade do bicho-pregui�a: " + pregui�a.getIdade());
		System.out.println("Som do bicho-pregui�a: " + pregui�a.getSom());
		System.out.println("A��o do bicho-pregui�a: " + pregui�a.getAcao());
		System.out.println("N�mero de patas do bicho-pregui�a: " + pregui�a.getPatas());
		System.out.println("Alimenta��o do bicho-pregui�a: " + pregui�a.getAlimentacao());		
		
		input.close();

	}

}
