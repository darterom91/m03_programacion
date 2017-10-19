package ams1_david_artero_estructures_repetitives2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n1, n2, i;
		
		System.out.print("Introduce el numero1: ");
		n1=s.nextInt();
		do{
			System.out.print("Introduce el numero2: ");
			n2=s.nextInt();
			
		}while(n1>n2);
		System.out.println("\n");
		for(i=n1;i<n2;i++){
			while(i%2==0){
				System.out.print(i+" ");
				break;
			}
		}
	}

}
