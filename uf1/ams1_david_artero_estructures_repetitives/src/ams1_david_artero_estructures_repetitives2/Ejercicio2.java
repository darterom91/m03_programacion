package ams1_david_artero_estructures_repetitives2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i, n1, n2;
		
		System.out.print("introduce el numero 1: ");
		n1=s.nextInt();
		do{
		System.out.println("introduce el numero2: ");
		n2=s.nextInt();
		}while(n2<n1);
		
		System.out.println("intervalo de numeros [n1<n2]\n"
						+  "========= == ======= =======\n");
		for(i=n1;i<n2;i++) {
			System.out.print(i+" ");
		}
		
	}
}
