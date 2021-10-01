package ciclos;
import java.util.Scanner;
	public class ciclos {
		public static void main(String[] args) {
			int num, x, y;
			Scanner input = new Scanner(System.in);
			
			System.out.println("Introduce un num");
			num = input.nextInt();
			x = 0;
			y = 0;
			for (x = num ; x > 0 ; --x) {
				for (y = x ; y > 0 ; --y) {
					System.out.print("*");
				}System.out.println();
			}
			System.out.println("\n");
			
			// Triangulo 2
			for (x = 1; x <= num; ++x) {
			    for (y = 1; y <= x; ++y) {
			      System.out.print("*");
			    }
			    System.out.println();
			  }
			System.out.println("\n");
			
			// Triangulo 3
			for (x = 0 ; x < num ; ++x) {
				for (y = num ; y > 0 ; --y) {
					 System.out.print("*");
				}
				System.out.println();
				}
			}
			
			}