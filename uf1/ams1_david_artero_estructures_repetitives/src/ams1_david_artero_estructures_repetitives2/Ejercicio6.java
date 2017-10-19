package ams1_david_artero_estructures_repetitives2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num, i, cifras=0;
		
		do{
		System.out.println("Introduce un numero de 2 cifras o mayor: ");
		num=s.nextInt();
		}while(num<10);
		
		
		
		for(i=0;i<num;i++){
			cifras++;
			num=num/10;			
			System.out.print(num+" ");
		}
		System.out.println("\nnumero de cifras: "+cifras);
		
	}

}
