package ams1_uf3_pr4_david_artero_binaris;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio2 prog = new Ejercicio2();
		prog.inicio();
	}

	public void inicio() {
		// TODO Auto-generated method stub
		File temp = null;
		try {
			temp = new File("fraseBin.bin");
			String frases[] = new String[78];
			RandomAccessFile raf = new RandomAccessFile(temp, "r");

			while (raf.getFilePointer() < raf.length()) {
				int numBytes = raf.readInt();
				if (numBytes > 3) {
					byte[] bytes = new byte[numBytes];
					for (int i = 0; i < numBytes; i++) {
						bytes[i] = raf.readByte();
					}
					String paraula = new String(bytes);
					System.out.println(paraula);
				} else {
					raf.skipBytes(numBytes);
				}

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
