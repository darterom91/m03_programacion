package ams1_david_artero_arrays;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int vec[] = new int[10];
		int num;
		boolean bol = false;
		
		for(int i=0;i<vec.length;i++) {
			do {
				System.out.println("Introduce el numero "+i+" del 0 al 10 : ");
				if(s.hasNextInt()) {
					vec[i]=s.nextInt(); 
					if(vec[i]>=0 && vec[i]<20) {
						bol = true;
					}else {
						System.out.println("err num fuera del rango\n");
					}
				}else {
					System.out.println("err num fuera del rango");
					s.next();
				}
			}while(bol!=true);
		}
		
		for(int i=0;i<vec.length;i++) {
			System.out.println("vec["+i+"] = "+vec[i]);
		}
	}

}
