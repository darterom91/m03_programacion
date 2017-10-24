package ams1_david_artero_arrays2;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int vec[] = new int[20], i = 0;

		while (i < vec.length) {
			System.out.println("Introduce el numero " + i);
			if (s.hasNextInt()){
				vec[i] = s.nextInt();
				i++;
			}else{
				System.out.println("Error el numero no es entero");
				s.next();
			}
		}
		
		System.out.println("\n\n============== Numeros enteros =================");
		for(i=0;i<vec.length;i++){
			System.out.print((i+1)+":["+vec[i]+"] ");
			if(i==vec.length/2){
				System.out.println("");
			}
		}
	}
}
