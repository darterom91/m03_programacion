package binaris;

import java.io.File;
import java.io.RandomAccessFile;

public class SobreDoblesBinari {

	public static void main(String[] args) {
		SobreDoblesBinari programa = new SobreDoblesBinari();
		programa.inici();
	}
	
	public void inici() {
		
		try {
			File f = new File("Enters.bin");
			RandomAccessFile raf = new RandomAccessFile(f, "rw");
			// L'apuntador està al primer byte
			long apuntador = raf.getFilePointer();
			System.out.println("Inici: Apuntador a posició " + apuntador);
			// Sobreescrivim els primers cinc valors
			for (int i = 0; i < 5; i++) {
			raf.writeInt(-1);
			}
			// Si el fitxer ja tenia més de cinc enters, al final hi ha brossa
			apuntador = raf.getFilePointer();
			System.out.println("Fi: Apuntador a posició " + apuntador);
			// Es fixa la mida del fitxer als valors escrits
			raf.setLength(apuntador);
			raf.close();
			System.out.println("Fitxer modificat correctament.");
			} catch (Exception e) {
			// Excepció!
			System.out.println("Error escrivint dades: " + e);
			}

	}
	
}
