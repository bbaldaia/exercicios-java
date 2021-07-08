import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);		
		
		int nota1, nota2, nota3, notaPesoUm, notaPesoDois, notaPesoTres, soma;
		double media;

		System.out.println("Digite sua primeira nota: ");
		nota1 = input.nextInt();

		System.out.println("Digite sua segunda nota: ");
		nota2 = input.nextInt();

		System.out.println("Digite sua terceira nota: ");
		nota3 = input.nextInt();

		notaPesoUm = nota1 * 2;
		notaPesoDois = nota2 * 3;
		notaPesoTres = nota3 * 5;

		soma = notaPesoUm + notaPesoDois + notaPesoTres;

		media = soma / 10;

		System.out.println("Sua média é: " + media);
		
		input.close();

			}

	}