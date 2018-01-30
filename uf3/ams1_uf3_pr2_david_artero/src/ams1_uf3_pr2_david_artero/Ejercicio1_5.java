package ams1_uf3_pr2_david_artero;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio1_5 {
	public static void main(String[] args) {
		Ejercicio1_5 prog = new Ejercicio1_5();
		prog.inicio();
	}

	public void inicio() {
		// TODO Auto-generated method stub
		File Temp = null;
		try {
			Temp = new File("Temp/bin.txt");
			PrintStream ps = new PrintStream(Temp);
			Scanner s = new Scanner(Temp);
			
			int mat[][]=new int[7][10];
			int matT[][]=new int[7][10];
			for(int i=0;i<mat.length;i++){
				for(int j=0;j<mat[i].length;j++){
					mat[i][j]=(int) Math.floor(Math.random() * (2 - 0) + 0);
					System.out.print(mat[i][j]);
					ps.print(mat[i][j]+" ");
				}
				ps.println();
				System.out.println();			
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
