package ams1_david_artero_condicionales2;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int any;
		
		System.out.println("Escribe el año: ");
		any=s.nextInt();
		
		if(any%4==0 && any%100!=0 || any%400==0){
			System.out.println("El año "+any+" es bisiesto");
		}else{
			System.out.println("El año "+any+" es bisiesto");
		}
		
	}
}
