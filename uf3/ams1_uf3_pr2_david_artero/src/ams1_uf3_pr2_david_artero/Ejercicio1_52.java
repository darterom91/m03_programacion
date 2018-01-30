package ams1_uf3_pr2_david_artero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1_52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio1_52 prog = new Ejercicio1_52();
		prog.inicio();
	}

	public void inicio() {
		// TODO Auto-generated method stub
		File Temp = null;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			Temp = new File("Temp/bin.txt");
			fr = new FileReader(Temp);
			br = new BufferedReader(fr);

			String linea;
			String[]mat = new String[7];
			int i = 0, j=0;
			// Lectura del fichero

			while ((linea = br.readLine()) != null) {
				mat[i]=linea;
				i++;
			}
			String maT[][]=new String[7][10];
			int maT2int[][]=new int[7][10];
			String valor="";
			i=0;
			while(i<mat.length){
				System.out.println(mat[i]);
				maT[i]=mat[i].split(" ");
				i++;
			}
			
			System.out.println("\nMatriz de 2 dimensiones:");
			for(i=0;i<maT.length;i++){
				for(j=0;j<maT[i].length;j++){
					System.out.print(maT[i][j]+" ");
				}
				System.out.print("\n");
			}
			
			for(i=0;i<maT.length;i++){
				for(j=0;j<maT[i].length;j++){
					valor=maT[i][j];
					maT2int[i][j]=Integer.parseInt(valor);
				}
			}
			
			System.out.println("\nMatriz de 2 dimensiones INT:");
			for(i=0;i<maT.length;i++){
				for(j=0;j<maT[i].length;j++){
					System.out.print(maT2int[i][j]+" ");
				}
				System.out.print("\n");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
