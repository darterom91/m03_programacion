package ams1_david_artero_matriz;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int mat[][]={{1,2,3},{4,5,6},{7,8,9}}, i=0, j = 0;
		for(i=0;i<mat.length;i++){
			for(j=0;j<mat[i].length;j++){
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
	}

}
