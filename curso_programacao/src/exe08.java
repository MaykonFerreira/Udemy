import java.util.Locale;
import java.util.Scanner;

public class exe08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x;
				
		x = sc.nextDouble();
		System.out.println("Voc� Digitou : " + x);
		System.out.printf("Voc� Digitou : %.2f%n", x);
		sc.close();

	}

}
