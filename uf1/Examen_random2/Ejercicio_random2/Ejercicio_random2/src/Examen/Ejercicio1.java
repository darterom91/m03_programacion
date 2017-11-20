package Examen;

import java.util.Scanner;

//Practica5 Ej [5] Pregunta examen: 1
//Practica5 Ej [7] Pregunta examen: 2
//Practica2 Ej [2] Pregunta examen: 3
//Practica4 Ej [1] Pregunta examen: 4
//Practica2 Ej [4] Pregunta examen: 5
//Practica1 Ej [4] Pregunta examen: 6

public class Ejercicio1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int mat[][]=new int[2][16];
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[i].length;j++){
				System.out.print("["+mat[i][j]+"]");
			}
			System.out.println();
		}
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[i].length;j++){
				System.out.println("Estado de la diente ["+i+"] ["+j+"]");
				if(s.hasNextInt()){
					mat[i][j]=s.nextInt();
					if(mat[i][j]<0||mat[i][j]>1){
						System.out.println("El rango es de 0 a 1");
						j--;
					}
				}else{
					System.out.println("El valor no es entero...");
					s.next();
				}
			}
		}
		
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[i].length;j++){
				System.out.print("["+mat[i][j]+"]");
			}
			System.out.println();
		}
	}

}
