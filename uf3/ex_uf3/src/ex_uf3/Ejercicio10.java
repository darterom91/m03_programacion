package ex_uf3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File temp = new File("mat.txt");
		try {
			PrintStream ps = new PrintStream(temp);
			int mat[][] = new int[7][10];
			mat = introMat(mat);
			for (int i = 0; i < 7; i++) {
				for (int j = 0; j < 10; j++) {
					System.out.print(mat[i][j] + " ");
					ps.print(mat[i][j]+" ");
				}
				System.out.println();
				ps.println();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static int[][] introMat(int[][] mat) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 10; j++) {
				mat[i][j] = (int) Math.floor(Math.random() * (2 - 0) + 0);
			}
		}
		return mat;
	}

}
