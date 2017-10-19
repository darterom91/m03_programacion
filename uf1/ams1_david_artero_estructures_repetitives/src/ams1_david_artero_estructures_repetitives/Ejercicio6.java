package ams1_david_artero_estructures_repetitives;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num, i, cant, mayor=0, med=0 ,menor=0;
		
		System.out.print("introduce la cantidad de numeros: ");
		cant=s.nextInt();
		
		for(i=0;i<cant;i++){
			System.out.print("Introduce el numero: "+i+": ");
			num=s.nextInt();
			System.out.println("\n");

			if(num>mayor){
				mayor=num;
			}
			
			if(num<mayor){
				menor=num;
			}
			
			med+=num;
			System.out.print(mayor+ ",  "+menor);
			System.out.println("\n");
		}
		med=med/i;
		System.out.println("la media es: "+med);

	}

}
