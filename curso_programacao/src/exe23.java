import java.util.Locale;
import java.util.Scanner;

public class exe23 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.println("Digite dois Numeros :");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if (num2 % num1 == 0) {
			System.out.println("S�O MULTIPLOS ME/MA");
		    }
		else if (num1 % num2 == 0) {
			     System.out.println("S�O MULTIPLOS MA/ME");
		     }
		else {
			      System.out.println("N�O S�O MULTIPLOS");
		}
		//}
		
		sc.close();


	}

}
