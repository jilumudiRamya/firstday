package operators;
import java.util.Scanner;


public class AverageCal {


	

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			float a = sc.nextFloat();
			float b = sc.nextFloat();
			float c = sc.nextFloat();
			float d = sc.nextFloat();
			float e = sc.nextFloat();
			float avg;
			float sum;
			sum=a+b+c+d+e;
			avg=sum/5;
			System.out.printf("%.2f",avg);
		
		}

	
		
	

}


