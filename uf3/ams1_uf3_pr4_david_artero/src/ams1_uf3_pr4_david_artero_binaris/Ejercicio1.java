package ams1_uf3_pr4_david_artero_binaris;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File temp = null;
		RandomAccessFile raf = null;
		
		try {
			temp = new File("fraseBin.bin");
			raf = new RandomAccessFile(temp, "rw");					
			String frase = "Habia una vez una frase";
			String frases[] = frase.split(" ");
			
			for(int i=0;i<frases.length;i++) {
				byte[] bytes = frases[i].getBytes();
				raf.writeInt(bytes.length);
				raf.writeBytes(frases[i]);
			}			
			System.out.println("Se ha escrito satisfactoriamente!!!");
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
