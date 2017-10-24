package ams1_david_artero_arrays;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int vec[]=new int [10];
		int num = 0, i;
		boolean bol = false;
		
		for(i=0;i<vec.length-1;i++) {
		do {
			System.out.println("introduce el numero "+i+" de la array:");
			if(s.hasNextInt()) {
			vec[i]=s.nextInt();
			bol= true; 
			}else {
				s.next();
			}			
			
		}while(bol!=true);
		}
		
		for(i=0;i<vec.length;i++) {
			System.out.println("El num "+i+" es: "+vec[i]);
		}
		
			do {
				System.out.println("\n\nintroduce el numero de comprovacion: ");
				if(s.hasNextInt()) {
				num=s.nextInt();
				bol= true; 
				}else {
					s.next();
				}			
				
			}while(bol!=true);
			
			for(i=0;i<vec.length;i++) {
				if(num == vec[i]) {
					System.out.println("num: "+num+" = vec["+i+"] "+vec[i]);
				}
			}
	}

}
