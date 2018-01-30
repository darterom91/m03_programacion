package ams1_uf3_pr4_david_artero_binaris;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio4 prog = new Ejercicio4();
		try {
			prog.inicio();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void inicio() throws IOException {
		// TODO Auto-generated method stub
		File temp = null;
		String linea = "";
		String comandos[] = { "a", "d" };
		String comandoLinea[] = new String[2];
		int valor = 0;
		temp = introfixer(temp);
		RandomAccessFile raf = new RandomAccessFile(temp, "rw");
		if (temp.isFile()) {
			System.out.println("existe");
			do {
				mostarfixer(raf);
				linea = introComando(linea);
				comandoLinea = linea.split(" ");

				if (comandoLinea[0].equals(comandos[0])) {
					System.out.println("Esta es la a");
					valor = Integer.parseInt(comandoLinea[1]);
					System.out.println("El valor es: " + valor);
					afegirValor(raf, valor);
				}

				if (comandoLinea[0].equals(comandos[1])) {
					System.out.println("Esta es la d");
					int posicion = Integer.parseInt(comandoLinea[1]);
					System.out.println("La poesicion es: " + posicion);
					eliminarPos(raf, posicion);
				}

			} while (!comandoLinea[0].equals("x"));
		} else {
			System.out.println("no existe");
			raf = new RandomAccessFile(temp, "rw");
			System.out.print(raf.length());
			do {
				mostarfixer(raf);
				linea = introComando(linea);
				comandoLinea = linea.split(" ");

				if (comandoLinea[0].equals(comandos[0])) {
					System.out.println("Esta es la a");
					valor = Integer.parseInt(comandoLinea[1]);
					System.out.println("El valor es: " + valor);
					afegirValor(raf, valor);
				}

				if (comandoLinea[0].equals(comandos[1])) {
					System.out.println("Esta es la d");
					int posicion = Integer.parseInt(comandoLinea[1]);
					System.out.println("La poesicion es: " + posicion);
				}

			} while (!comandoLinea[0].equals("x"));
		}
		raf.close();
		System.out.println("Has salido");
	}

	public void eliminarPos(RandomAccessFile raf, int posicion) {
		// TODO Auto-generated method stub
		int valor=0;
		try {
			if(posicion>=raf.length()/4||posicion<0){
				System.out.println("Posicion no esta...");
			}else{
				System.out.println("Si existe");
				long maxPos= raf.length()-4;
				long pos=(posicion+1)*4;
				
				while(pos<raf.length()){
					System.out.println("pos: "+pos);
					raf.seek(pos);
					valor=raf.readInt();
					raf.seek(pos-4);
					System.out.println("valor: "+valor);
					raf.writeInt(valor);
					pos=pos+4;
					System.out.println("pos+4: "+pos+"\n");
				}
				System.out.println("pos: "+pos);
				raf.setLength(maxPos);
				System.out.println("maxPos"+maxPos);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void mostarfixer(RandomAccessFile raf) {
		// TODO Auto-generated method stub
		try {
			long numEnters = raf.length() / 4;
			// Cal garantir que l'apuntador esta al principi
			raf.seek(0);
			for (long i = 0; i < numEnters; i++) {
				if (i % 10 == 0) {
					System.out.println();
				}
				int valor = raf.readInt();
				System.out.print(valor + " ");
			}
		} catch (Exception e) {
			System.out.println("Error llegint fitxer: " + e);
		}
	}

	public void afegirValor(RandomAccessFile raf, int valor) {
		// TODO Auto-generated method stub
		try {
			long fiFixer = raf.length();
			raf.seek(fiFixer);
			raf.writeInt(valor);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String introComando(String comando) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Intro comanda: ");
		comando = s.nextLine();
		return comando;
	}

	public File introfixer(File temp) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		System.out.println("Introduce el nombre del fichero: ");
		temp = new File(s.next());

		return temp;
	}

}
