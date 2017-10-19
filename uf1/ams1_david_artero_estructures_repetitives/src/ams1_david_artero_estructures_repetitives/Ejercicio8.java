package ams1_david_artero_estructures_repetitives;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num, cant, i;
		System.out.println("Introduce un numero: ");
		num = s.nextInt();
		cant=num;
		for(i=1;i<num;i++){
			if(num%i==0){
				System.out.print(i+" ");
			}
		}
		System.out.print(num);
	}

}
