package ams1_david_artero_matriz;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int matA[][]=new int[4][3], i, j;
		
		int sumA[][]={{1,2},{3,4},{5,6},{7,8}}; 
		int sumB[][]={{1,2},{3,5},{6,7},{5,5}}; 
		int sumR[][]=new int[4][2];
		
		System.out.println("\nParte 1: \n"
							+"----- --\n\n"
							+ "La multiplicacion de la matriz \n"
							+ "-- -------------- -- -- ------\n");
		//Validador de la matriz
		for(i=0;i<matA.length;i++){
			for(j=0;j<matA[i].length;j++){
				System.out.println("Introduce el numero en el vec ["+i+"] ["+j+"]: ");
				if(s.hasNextInt()){
					matA[i][j]=s.nextInt();
				}else{
					System.out.println("El numero no es entero...");
					s.next();
					j--;
				}
			}
		}
		System.out.println("Mostrar los numeros introducidos en la matriz: ");
		for(i=0;i<matA.length;i++){
			for(j=0;j<matA[i].length;j++){
				System.out.print("["+matA[i][j]+"] ");
			}
			System.out.println();
		}
		//Multiplicar cada numero de los vectores
		for(i=0;i<matA.length;i++){
			for(j=0;j<matA[i].length;j++){
				matA[i][j]=matA[i][j]*5;
			}
		}
		//Mostrar la matriz
		System.out.println("Mostrar el resultado de la Multiplicacion: ");
		for(i=0;i<matA.length;i++){
			for(j=0;j<matA[i].length;j++){
				System.out.print("["+matA[i][j]+"] ");
			}
			System.out.println();
		}
		
		//Parte 2
		System.out.println("\nParte 2: \n"
							+"----- --\n\n"
							+ "La suma de matrices\n"
							+ "-- ---- -- --------\n");
		for(i=0;i<sumA.length;i++){
			for(j=0;j<sumA[i].length;j++){
				System.out.print("["+sumA[i][j]+"]");
			}
			System.out.print("\t+\t");
			for(j=0;j<sumA[i].length;j++){
				System.out.print("["+sumB[i][j]+"]");
			}
			System.out.println();
		}
		
		//Se suma en cada vuelta la posicion del vector de la matriz SumaA 
		//con la posicion del vector de la matriz sumaB
		for(i=0;i<sumA.length;i++){
			for(j=0;j<sumA[i].length;j++){
				sumR[i][j]=sumA[i][j]+sumB[i][j];
			}
		}
		
		System.out.println("\nMostar la suma de matrices\n");
		for(i=0;i<sumA.length;i++){
			System.out.print("| ");
			for(j=0;j<sumA[i].length;j++){
				System.out.print(" "+sumA[i][j]+" ");
			}
			System.out.print(" |\t+\t| ");
			for(j=0;j<sumA[i].length;j++){
				System.out.print(" "+sumB[i][j]+" ");
			}
			System.out.print(" |\t=\t| ");
			for(j=0;j<sumA[i].length;j++){
				System.out.print(" "+sumR[i][j]+" ");
			}
			System.out.print(" |");
			System.out.println();
		}
	}

}
