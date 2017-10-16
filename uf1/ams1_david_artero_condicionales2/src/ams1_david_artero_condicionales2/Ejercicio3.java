package ams1_david_artero_condicionales2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num, num2, num3;
		
		System.out.println("introduce el numero 1: ");
		num=s.nextInt();
		System.out.println("introduce el numero 2: ");
		num2=s.nextInt();
		System.out.println("introduce el numero 3: ");
		num3=s.nextInt();
		
		if(num < num2 && num2 < num3 || num > num2 && num2 > num3){
			System.out.println("Numeros ordenados: "+num+", "+num2+", "+num3);
		}else{
			System.out.println("Numeros desordenados: "+num+", "+num2+", "+num3);
		}
	}

}
