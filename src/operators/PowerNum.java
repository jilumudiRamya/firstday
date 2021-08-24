package operators;
import java.util.Scanner;


public class PowerNum {
	

		public static void main(String[] args) {
			int x;
			int N;
			Scanner sc=new Scanner(System.in);
			x=sc.nextInt();
			N=sc.nextInt();
			double result;
			result = Math.pow(x,N);
			System.out.println(Math.pow(x,N));

		}

	

}
