import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a, b, c, d, ee, f;
		double x, y;

		System.out.println("Digite o valor de A");
		a = input.nextInt();
		
		System.out.println("Digite o valor de B");
		b = input.nextInt();
		
		System.out.println("Digite o valor de C");
		c = input.nextInt();
		
		System.out.println("Digite o valor de D");
		d = input.nextInt();
		
		System.out.println("Digite o valor de E");
		ee = input.nextInt();
		
		System.out.println("Digite o valor de F");
		f = input.nextInt();

		x = ((c * ee) - (b * f)) / ((a * ee) - (b * d));
		y = ((a * f) - (c * d)) / ((a * ee) - (b * d));

		System.out.println("O valor de x é: " + x);
		System.out.println("O valor de y é: " + y);
		
		input.close();			
				
			}
			
		}
