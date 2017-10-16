package ams1_david_artero_condicionales2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num;
		
		System.out.println("Introduce un numero: ");
		num=s.nextInt();
		
		if(num%2!=0){
			System.out.println("El numero "+num+" es senar");
		}else{
			System.out.println("El numero "+num+" es parell");
		}
	}

}
