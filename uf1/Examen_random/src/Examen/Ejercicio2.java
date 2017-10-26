package Examen;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int cant = 0, num, i=0, cont=0;
		
		do{
			System.out.println("Introduce la cantidad de numeros");
			if(s.hasNextInt()){
				cant=s.nextInt();
				i++;
			}
		}while(i<1);
		
		i=0;
		
		while(i<cant){
			System.out.println("introduce el numero: "+i);
			
			if(s.hasNextInt()){
				num=s.nextInt();
				if(num<0){
					System.out.println("num: "+num);
					cont++;
				}
				i++;
			}else{
				System.out.println("Error no es una valor entero.");
				s.next();
			}
		}
		System.out.println("\nla cantidad de numeros negativos es: "+cont);
	}

}
