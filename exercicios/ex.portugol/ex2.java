import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
		
		int idadeAnos, idadeMeses, idadeDias, idadeDias1;
			
		System.out.println("Digite os dias: ");
		idadeDias = input.nextInt();

		idadeAnos = (idadeDias/365);
		idadeMeses = (idadeDias%365)/30;
		idadeDias1 = (idadeDias%365)%30;

		System.out.println("A idade é de " + idadeAnos + " anos, " + idadeMeses + " meses e " + idadeDias1 + " dias ");
		
		input.close();
				
			}
		}

	
