package ams1_david_artero_matriz;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][]= {{3,4,5},{6,7,8},{9,10,11}};
		//Ejercicio a motrar los numeros 5,7,9
		System.out.println("["+mat[0][2]+"]");
		System.out.println("["+mat[1][1]+"]");
		System.out.println("["+mat[2][0]+"]");
		
		System.out.print("\n\nMostrar valores de la matriz:\n");
		for(int i = 0; i<mat.length;i++) {
			for(int j=0; j<mat[i].length;j++) {
				System.out.print("["+mat[i][j]+"]");
			}
		}
		
		//Ejercicio c1 mostrar por lineas
		System.out.print("\n\nMostrar valores de la matriz por lineas:\n");
		System.out.print("\n\n");
		for(int i = 0; i<mat.length;i++) {
			for(int j=0; j<mat[i].length;j++) {
				System.out.print("["+mat[i][j]+"]");
			}
			System.out.println();
		}
		
		//Ejercicio c2 mostar numeros por columnas
		System.out.print("\n\nMostrar valores de la matriz por columnas:\n");
		System.out.print("\n\n");
		for(int i = 0; i<mat.length;i++) {
			System.out.println("Linea "+i+": ");
			for(int j=0; j<mat[i].length;j++) {
				System.out.print("columna "+j+": ");
				if(i==0&&j==0||i==1&&j==0||i==2&&j==0) {
					System.out.print(" ["+mat[i][j]+"] ");
				}
				if(i==0&&j==1||i==1&&j==1||i==2&&j==1) {
					System.out.print(" ["+mat[i][j]+"] ");
				}
				if(i==0&&j==2||i==1&&j==2||i==2&&j==2) {
					System.out.print(" ["+mat[i][j]+"] ");
				}
				
			}
			System.out.println();
		}
		System.out.print("\n\n");
		//Ejercicio d mostra numeros en diagonal
		System.out.print("\n\nMostrar valores de la matriz en diagonal:\n");
		for(int i = 0; i<mat.length;i++) {
			System.out.println("Linea "+i+": ");
			for(int j=0; j<mat[i].length;j++) {
				System.out.print("columna "+j+": ");
				if(i==0&&j==0) {
					System.out.print(" ["+mat[i][j]+"] ");
				}
				if(i==1&&j==1) {
					System.out.print(" ["+mat[i][j]+"] ");
				}
				if(i==2&&j==2) {
					System.out.print(" ["+mat[i][j]+"] ");
				}
				
			}
			System.out.println();
		}
	}

}
