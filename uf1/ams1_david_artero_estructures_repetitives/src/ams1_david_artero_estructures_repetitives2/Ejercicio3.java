package ams1_david_artero_estructures_repetitives2;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i, n1, n2, res=0;
		
		System.out.print("Introduce el numero1: ");
		n1= s.nextInt();
		do {
			System.out.print("Introduce el numero2: ");
			n2=s.nextInt();
		}while(n1>n2);
		
		i=n1;
		while(i<n2) {
			System.out.print("la suma de "+res+" + "+i+"= ");
			res=res+i;
			System.out.print(" "+res+"\n");
			i++;
		}
		
		System.out.println("\nEl resultado final es: "+res);
	}
}
