package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Encapsulamento;

public class aula10 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Encapsulamento mov;
		double dep;
		System.out.print ("Enter account number : ");
		int numero = sc.nextInt();
		System.out.print ("Enter Nome : ");
		// Quando se Usa numero antes
		sc.nextLine();
		String nome = sc.nextLine();
		//System.out.println(nome);
		System.out.print ("Deseja fazer um Deposito Inicial (y/n) ? ");
		char resp = sc.nextLine().charAt(0);
		
		if (resp == 'y') {
			System.out.print ("Entre com o Valor : ");
			dep = sc.nextDouble();
			mov = new Encapsulamento(nome,numero,dep);
		}
		else {
			mov = new Encapsulamento(nome,numero);
		}
		System.out.println ("Account data :");
		System.out.println(mov.toString());
		
		System.out.print ("Entre com o Valor deposito :");
		dep = sc.nextDouble();
		mov.dep(dep);
		System.out.println(mov.toString());
		System.out.print ("Entre com o Valor Saque :");
		dep = sc.nextDouble();
		mov.saque(dep);
		System.out.println(mov.toString());		
		
		sc.close();
	}

}
