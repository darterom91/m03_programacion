package ams1_david_artero_arrays2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int vec[]={1,12,4,5,7,3,2,9,6,7}, cont=0;
		
		System.out.println("Numeros multiples de 10 vec1");
		for(int i=0;i<vec.length;i++){
			if(vec[i]%3==0){
				cont++;
				if(cont==2){
				System.out.println("numeros: "+vec[i]);
				}
			}
		}
		System.out.println("Cantidad de multiples de 10: "+cont);
		
		
		int vec2[]={1,13,4,5,7,3,2,8,5,7};
		cont=0;
		
		System.out.println("\nNumeros multiples de 10 vec2");
		for(int i=0;i<vec2.length;i++){
			if(vec2[i]%3==0){
				cont++;
				if(cont==2){
				System.out.println("numeros: "+vec2[i]);
				}else if(cont==1){
					System.out.println("No hay suficientes valores multiples de 3");
				}
			}
		}
		System.out.println("Cantidad de multiples de 10: "+cont);
	}
}
