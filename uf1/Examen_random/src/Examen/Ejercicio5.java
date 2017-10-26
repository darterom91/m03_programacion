package Examen;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); 
		int i=0, any=0;
		
		for(i=0;i<1;i++){
			System.out.print("\nIntroduce un año: ");
			if(s.hasNextInt()){
				any=s.nextInt();
			}else{
				System.out.println("no es un valor entero... ");
				s.next();
				i--;
			}
		}
		
		if(any%4==0 && any%100!=0 || any%400==0){
			System.out.println("El año "+any+" es bisiesto. ");
		}else{
			System.out.println("El año "+any+" no es bisiesto. ");
		}
	}

}
