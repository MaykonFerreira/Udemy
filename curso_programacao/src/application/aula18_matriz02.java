package application;

import java.util.Locale;
import java.util.Scanner;

public class aula18_matriz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//List<Integer><Integer> list = new ArrayList<><>();
		
		 int m = sc.nextInt();
		 int n = sc.nextInt();
		 
		 
		 int [][] mat = new int [m][n];
		 for (int l = 0 ; l < mat.length ; l++) {
			 for (int c = 0 ; c < mat[l].length ; c ++) {
				 mat [l][c] = sc.nextInt();
			 }
			 
		 }
		 System.out.print("Numero a ser localizado : ");
		 int loc = sc.nextInt();
		 
		 
		 for (int l = 0 ; l < mat.length ; l++) {
			 for (int c = 0 ; c < mat[l].length ; c ++) {
				 if (mat [l][c] == loc) {
					 System.out.println("Position " + l + "," + c + ":");
					 // Esquerda
						if (c > 0) {
							System.out.println("Left: " + mat[l][c-1]);
						}
						if (l > 0) {
							System.out.println("Up: " + mat[l-1][c]);
						}
						if (c < mat[l].length-1) {
							System.out.println("Right: " + mat[l][c+1]);
						}
						if (l < mat.length-1) {
							System.out.println("Down: " + mat[l+1][c]);
						}						
				 }
			 }			 

			 
				 //System.out.print(mat [l][l] + " ") ;
		 }		 
		
		 //System.out.println("\nQty Negativo(s) " + neg);
		 
		 //System.out.println(mat);
		 sc.close();
	}

}
