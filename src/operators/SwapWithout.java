package operators;
import java.util.Scanner;

public class SwapWithout {
	

	

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("The value of a is:"+a);
			System.out.println("The value of b is:"+b);

		}
	}
	