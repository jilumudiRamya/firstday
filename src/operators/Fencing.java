package operators;
import java.util.Scanner;
public class Fencing {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int l=sc.nextInt();
			int w=sc.nextInt();
			System.out.println(2*(l+w)+"m");
			System.out.println(l*w+"sqm");
		}

	
}
