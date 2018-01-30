package binaris;

import java.io.File;
import java.io.RandomAccessFile;

public class lectura {

	public static void main(String[] args) {
		lectura programa = new lectura();
		programa.inici();
	}

	public void inici() {

		try {
			File f = new File("Enters.bin");
			RandomAccessFile raf = new RandomAccessFile(f, "r");
			// Càlcul del nombre d'enters  un enter 4 bytes
			long numEnters = f.length() / 4;  
			System.out.println("Hi ha " + numEnters + " enters.");
			for (int i = 0; i < numEnters; i++) {
				int valor = raf.readInt();
				System.out.println("S'ha llegit el valor " + valor);
			}
			raf.close();
		} catch (Exception e) {
			// Excepció!
			System.out.println("Error en la lectura: " + e);
		}

	}

}
