import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int idade, anos, meses, dias;

		System.out.println("Qual a sua idade?");
		idade = input.nextInt();

		anos = idade;
		meses = idade * 12;
		dias = idade * 365;

		System.out.println("Você tem " + dias + " de vida!");	
		
		input.close();
	}
	
	}


