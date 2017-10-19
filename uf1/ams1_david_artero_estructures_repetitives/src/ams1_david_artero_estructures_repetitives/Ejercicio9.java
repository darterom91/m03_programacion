package ams1_david_artero_estructures_repetitives;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num, cant, cont=0;
		int i=0;
		System.out.println("introduce la cantidad de numeros: ");
		cant=s.nextInt();
		
		while(i<cant){
			System.out.println("introduce un numero: ");
			num=s.nextInt();
			if(num<0){
				System.out.println("numero negativo: "+num);
				cont++;
			}
			i++;			
		}
		System.out.println("La cantidad de negativos: "+cont);
		
	}
}
