import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
		
		double a, b, c, r, s, d;

				System.out.println("Digite o número A");
				a = input.nextDouble();

				System.out.println("Digite o número B");
				b = input.nextDouble();

				System.out.println("Digite o número C");
				c = input.nextDouble();
				
				r = Math.pow((a + b), 2);
				s = Math.pow((b + c), 2);
				
				d = (r + s) / 2;

				input.close();	
			}
			
		}

		


