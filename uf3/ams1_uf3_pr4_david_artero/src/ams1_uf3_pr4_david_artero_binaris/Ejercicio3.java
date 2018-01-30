package ams1_uf3_pr4_david_artero_binaris;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio3 prog = new Ejercicio3();
		prog.inicio();
	}

	public void inicio() {
		// TODO Auto-generated method stub
		String nomFixer = "";
		Scanner s = new Scanner(System.in);
		File temp = null;
		File temp2 = null;

		System.out.println("introduce el nombre del fichero origen: ");
		temp = origenFixer(temp, nomFixer);
		System.out.println(temp.getName());
		System.out.println("introduce el nombre del fichero origen: ");
		temp2 = destinoFixer(temp2, nomFixer);
		System.out.println(temp2.getName());
		if (!temp2.isFile()) {
			try {
				leerFichero(temp, temp2);
				System.out.println("Copia realizada");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			System.out.println("No se pudo copiar ya que "+temp2.getName()+" existe...");
		}

	}

	public void leerFichero(File temp, File temp2) throws FileNotFoundException {
		// TODO Auto-generated method stub
		RandomAccessFile raf = new RandomAccessFile(temp, "r");
		RandomAccessFile raf2 = new RandomAccessFile(temp2, "rw");
		int cont = 0;
		String frases[] = new String[5];
		try {
			while (raf.getFilePointer() < raf.length()) {
				int numBytes = raf.readInt();
				if (numBytes >= 3) {
					// Si ocupa més de tres bytes, es llegeix i es mostra
					byte[] bytes = new byte[numBytes];
					for (int i = 0; i < numBytes; i++) {
						bytes[i] = raf.readByte();
					}
					String paraula = new String(bytes);
					frases[cont] = paraula;
					System.out.println(paraula);
				} else {
					// Si n'ocupa menys, se salta
					raf.skipBytes(numBytes);
				}
				cont++;
			}
			raf.close();

			System.out.println("\n\nArray de frases: ");
			for (int i = 0; i < frases.length; i++) {
				byte bytes[] = frases[i].getBytes();
				raf2.writeInt(bytes.length);
				raf2.writeBytes(frases[i]);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public File destinoFixer(File temp2, String nomFixer) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		nomFixer = s.next();
		temp2 = new File(nomFixer);

		if (temp2.isFile()) {
			System.out.println("existe");
		} else {
			System.out.println("no existe");
		}
		return temp2;
	}

	public File origenFixer(File temp, String nomFixer) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		nomFixer = s.next();
		temp = new File(nomFixer);

		if (temp.isFile()) {
			System.out.println("existe");
		} else {
			System.out.println("no existe");
		}
		return temp;
	}

}
