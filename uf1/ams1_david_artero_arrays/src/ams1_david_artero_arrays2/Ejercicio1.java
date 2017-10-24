package ams1_david_artero_arrays2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num, cont = 0;
		String palabra;
		
		System.out.println("introduce una palabra: ");
		palabra=s.next();
		
		for(int i=0;i<palabra.length();i++ ){
			if(palabra.charAt(i)=='a'){
				System.out.println(i);
				cont++;
			}
		}
		
		System.out.println("La cantidad de [a] es: "+cont);
	}

}
