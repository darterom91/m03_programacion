package ams1_david_artero_arrays;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		int vec[] = new int[10], res = 0; 
		boolean bol = false;
		
		for(int i=0;i<vec.length;i++){
			System.out.println("Introduce el numero "+i+": ");
			do{
				if(s.hasNextInt()){
					vec[i]=s.nextInt();
					bol = true;
				}else{
					System.out.println("Error-- no es un valor entero");
					s.next();
					
				}
			}while(bol!=true);
		}
		
		System.out.println("\n================ Numeros multiples de 3 ==================");
		for(int i=0;i<vec.length;i++){
			if(vec[i]%3==0){
				System.out.println("numero: "+vec[i]);
				res = res + vec[i];
			}
		}
		System.out.println("\n>:La suma es: "+res);
	}

}
