import java.util.Scanner;

public class ex3 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int segundos, horas, minutos, totalSegundos;

		System.out.println("Quanto tempo durou o evento na fábrica: ");
		segundos = input.nextInt();

		horas = segundos / 3600;
		minutos = (segundos % 3600) / 60;
		totalSegundos = segundos % 60;

		System.out.println(horas + "h " + minutos + "m " + totalSegundos + "s");
		
		input.close();
		
	}		

	
}
