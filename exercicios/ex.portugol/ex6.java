import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);		
		
		int x1, x2, y1, y2;
		double valorX, valorY, d;

		System.out.println("O valor de x1 é: ");
		x1 = input.nextInt();

		System.out.println("O valor de x2 é: ");
		x2 = input.nextInt();
		
		System.out.println("O valor de y1 é: ");
		y1 = input.nextInt();

		System.out.println("O valor de y2 é: ");
		y2 = input.nextInt();

		valorX = Math.pow((x1 - x2), 2.0);
		valorY = Math.pow((y1 - y2), 2.0);
		
		d = Math.sqrt(valorX + valorY);
		
		System.out.println("O valor da raíz quadrada é de: " + d);
		
		input.close();
		
			}
			
		}

	
