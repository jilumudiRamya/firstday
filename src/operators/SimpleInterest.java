package operators;
import java.util.Scanner;
public class SimpleInterest {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int p =sc.nextInt();
			int l =sc.nextInt();
			float f =sc.nextFloat();
			float interest =(float)p*(float)f*l;
			float total = interest/100;
			System.out.printf("%2f",+total);
		}

}
