package Examen;

import java.util.Scanner;

public class Ejercicio6 {
	public static int N = 6;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char dni[]={'T','R','W','A','G','H','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		int num = 0, i=0;
		
		do{
			System.out.println("Si quieres saber tu letra de DNI introduce el numero: ");
			if(s.hasNextInt()){
			num=s.nextInt();
			i++;
			}else{
				System.out.println("El valor no es entero...");
				s.next();
			}
		}while(i<1);
		
		i=num%dni.length;
		System.out.println("LA letra de tu dni es: "+dni[i]);
	}
}