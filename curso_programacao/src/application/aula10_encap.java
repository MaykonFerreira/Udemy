package application;

import java.util.Locale;
import java.util.Scanner;

public class aula10_encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter account number : ");
		int numero = sc.nextInt();
		System.out.print("Enter Nome : ");
		String nome = sc.next();
		sc.close();
	}

}
