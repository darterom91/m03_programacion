package ex_uf3_david_artero;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejercicio3 prog = new ejercicio3();
		prog.inicio();
	}

	private void inicio() {
		// TODO Auto-generated method stub
		try {
			File temp = new File("Doubles_copia.bin");
			RandomAccessFile raf = new RandomAccessFile(temp, "r");
			File temp2 = new File("Doubles_copia.bin");
			RandomAccessFile raf2 = new RandomAccessFile(temp2, "rw");
			// Càlcul del nombre d'enters  un enter 4 bytes
			long numEnters = temp.length() / 8;  
			double aux=0;
			double nums[] = new double[(int) numEnters];
			System.out.println("Hi ha " + numEnters + " enters.");
			for (int i = 0; i < numEnters; i++) {
				double valor = raf.readDouble();
				System.out.println(valor);
				nums[i]=valor;
			}
			
			Arrays.sort(nums);
			System.out.println();
			for(int i=0;i<nums.length;i++) {
				System.out.println(nums[i]);
			}
		
			for (int i = 0; i < nums.length; i++) {
				raf2.writeDouble(nums[i]);
			}
			
			raf.close();

			raf2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
