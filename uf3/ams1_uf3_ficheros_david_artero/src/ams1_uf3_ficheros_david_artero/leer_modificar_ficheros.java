package ams1_uf3_ficheros_david_artero;

import java.io.File;
import java.util.Date;

public class leer_modificar_ficheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leer_modificar_ficheros prog = new leer_modificar_ficheros();
		prog.inici();
	}

	public void inici() {
		// TODO Auto-generated method stub
		String dirWork =System.getProperty("user.dir");
		System.out.println(dirWork);
		
		File Documento = new File("temp/Document.txt");
		File origen = new File("temp"); 
		File destino = new File("temp/media");

		Date data =new Date(Documento.lastModified());
		
		System.out.println("Ultima modificación; "+data);
		System.out.println("Tamaño del archivo: "+origen.length());
		
		boolean res = destino.renameTo(Documento);
		System.out.println("Se ha movido? "+res);
		
		mostrarFitxers(Documento);

	}
	public void mostrarFitxers(File f) {
		System.out.println(f.getName() + " es un fixer ? "+f.isFile());
		System.out.println(f.getAbsolutePath() + "es un directory ? "+f.isDirectory());
	}
}
