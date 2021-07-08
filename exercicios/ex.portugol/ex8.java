import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double custoFabrica, porcentagemDistribuidor, impostos, custoConsumidor;				

		System.out.println("Qual o custo de fábrica? ");
		custoFabrica = input.nextDouble();

		porcentagemDistribuidor = (custoFabrica * 28) / 100;
		impostos = (custoFabrica * 45) / 100;
		custoConsumidor = custoFabrica + porcentagemDistribuidor + impostos;

		System.out.println("O custo final para o consumidor é de " + custoConsumidor);		
		
		input.close();
		
			}
			
		}
