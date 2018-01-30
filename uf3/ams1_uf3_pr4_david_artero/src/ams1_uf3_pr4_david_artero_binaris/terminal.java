package ams1_uf3_pr4_david_artero_binaris;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class terminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dir = System.getProperty("user.dir");
		File temp = new File(dir);
		String comandos[] = { "cd", "ls", "mkdir", "mkfile", "del", "contIns", "viwfile", "exit", "help" };
		String comando = "";
		String descomponer[] = new String[2];

		do {
			System.out.print(temp.getAbsolutePath() + " $: ");
			comando = introComando(comando);
			descomponer = comando.split(" ");
			// Moverte por carpetas
			if (descomponer[0].equals(comandos[0])) {
				temp = moveDir(comando, temp);
			}
			// listar contenido
			if (descomponer[0].equals(comandos[1])) {
				File listFile[] = temp.listFiles();
				mostrarLista(listFile);
			}
			// Crear carpetas
			if (descomponer[0].equals(comandos[2])) {
				File crearDir = null;
				crearDir = crearDir(comando, crearDir, temp);
			}
			// crear ficheros
			if (descomponer[0].equals(comandos[3])) {
				File crearFile = null;
				crearFile = crearFile(comando, crearFile, temp);
			}
			// borrar ficheros
			if (descomponer[0].equals(comandos[4])) {
				File crearFile = null;
				crearFile = delFile(comando, crearFile, temp);
			}
			// insertar contenido
			if (descomponer[0].equals(comandos[5])) {
				File insertFile = null;
				insertFile = insertFile(comando, insertFile, temp);
			}
			// ver contenido
			if (descomponer[0].equals(comandos[6])) {
				File viwFile = null;
				viwFile = viwFile(comando, viwFile, temp);
			}
			// help
			if (descomponer[0].equals(comandos[8])) {
				System.out.println(comandos[0] + ": Sirve para moverte entre directorios.");
				System.out.println(comandos[1] + ": Listar directorios.");
				System.out.println(comandos[2] + ": Crear directorios.");
				System.out.println(comandos[3] + ": Crear ficheros.");
				System.out.println(comandos[4] + ": borrar ficheros o directorios.");
				System.out.println(comandos[5] + ": insertar contenido a file");
				System.out.println(comandos[6] + ": ver contenido a file");
				System.out.println(comandos[7] + ": Salir del terminal");
				System.out.println(comandos[8] + ": Muestra el funcionamiento de cada comando.");
			}

		} while (!descomponer[0].equals(comandos[7]));

		System.out.print("has salido");
	}

	private static File viwFile(String comando, File viwFile, File temp) {
		// TODO Auto-generated method stub
		String dec[]=comando.split(" ");
		viwFile =new File(temp.getAbsolutePath()+"/"+dec[1]);
		try {
			FileReader fr = new FileReader (viwFile);
			BufferedReader br = new BufferedReader(fr);

	         // Lectura del fichero
	         String linea;
	         while((linea=br.readLine())!=null)
	            System.out.println(linea);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return viwFile;
	}

	private static File insertFile(String comando, File insertFile, File temp) {
		// TODO Auto-generated method stub
		String dec[] = comando.split(" ");
		insertFile = new File(temp.getAbsoluteFile() + "/" + dec[1]);
		String lorem[] = { "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto.",
				"Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen.",
				"No sólo sobrevivió 500 años, sino que tambien ingresó como texto de relleno en documentos electrónicos, quedando esencialmente igual al original." };

		if (insertFile.isFile()) {
			System.out.println("El file existe");
			try {
				PrintStream ps = new PrintStream(insertFile);
				for (int i = 0; i < lorem.length; i++) {
					ps.println(lorem[i]);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return insertFile;
	}

	private static File delFile(String comando, File delFile, File temp) {
		// TODO Auto-generated method stub
		String desc[] = comando.split(" ");
		delFile = new File(temp.getAbsoluteFile() + "/" + desc[1]);
		if (delFile.isDirectory()) {
			boolean borrar = delFile.delete();
			if (borrar == true) {
				System.out.println("Directorio borrado");
			}
		} else {
			System.out.println("No existe este directorio");
		}

		if (delFile.isFile()) {
			boolean borrar = delFile.delete();
			if (borrar == true) {
				System.out.println("File borrado");
			}
		} else {
			System.out.println("No existe este file");
		}

		return delFile;
	}

	private static File crearFile(String comando, File crearFile, File temp) {
		// TODO Auto-generated method stub
		try {
			String desc[] = comando.split(" ");
			crearFile = new File(temp.getAbsoluteFile() + "/" + desc[1]);
			try {
				PrintStream ps = new PrintStream(crearFile);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("El comando mkfile no puede ir solo");
		}
		return crearFile;
	}

	private static File crearDir(String comando, File crearDir, File temp) {
		// TODO Auto-generated method stub
		try {
			String desc[] = comando.split(" ");
			crearDir = new File(temp.getAbsoluteFile() + "/" + desc[1]);
			boolean bol = crearDir.mkdir();
			System.out.println("Carpeta creada? " + bol);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("El comando mkdir no puede ir solo");
		}
		return crearDir;
	}

	private static void mostrarLista(File[] listFile) {
		// TODO Auto-generated method stub

		for (int i = 0; i < listFile.length; i++) {
			Date data = new Date(listFile[i].lastModified());
			if (listFile[i].isDirectory()) {
				System.out.println("dir: " + listFile[i].getName() + " - " + listFile[i].length() + "T - " + data);
			}
		}

		for (int i = 0; i < listFile.length; i++) {
			Date data = new Date(listFile[i].lastModified());
			if (listFile[i].isFile()) {
				System.out.println("file: " + listFile[i].getName() + " - " + listFile[i].length() + "T - " + data);
			}
		}

	}

	private static File moveDir(String com, File temp) {
		// TODO Auto-generated method stub
		String desc[] = com.split(" ");

		try {
			if (desc[1].equals("..")) {
				String padre = temp.getParent();
				if (padre != null) {
					File novaRuta = new File(padre);
					return novaRuta;
				}
			} else {
				String padre = temp.getAbsolutePath();
				temp = new File(temp.getAbsolutePath() + "/" + desc[1]);
				if (temp.isDirectory()) {
					System.out.println(temp.getName());
				} else {
					System.out.println("no existe");
					File novaRuta = new File(padre);
					return novaRuta;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Cd no puede ir solo");
		}
		return temp;
	}

	private static String introComando(String comando) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		comando = s.nextLine();
		return comando;
	}

}
