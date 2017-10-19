package ams1_david_artero_estructures_repetitives2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int i, n1, n2;
		System.out.print("Introduc el numero 1: ");
		n1=s.nextInt();
		do {
		System.out.print("Introduce el numero2: ");
		n2=s.nextInt();	
		}while(n1>n2);
		
		for(i=n1;i<=n2;i++) {
			if(i%n1==0) {
				System.out.println(i);
			}
		}
	}

}
