package ams1_uf3_ficheros_david_artero;

import java.io.File;

public class comprobar_ficheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		comprobar_ficheros programa = new comprobar_ficheros();
		programa.inicio();
	}

	public void inicio() {
		// TODO Auto-generated method stub
		File fixer = new File("temp/fotos");
		File fotos = new File("temp/document.txt");
		File documents = new File("document.txt");
		
	mostrarFitxers(fixer);
//		mostrarFitxers(fotos);
		String dirWork=System.getProperty("user.dir");
		System.out.println(dirWork);
		boolean res = fotos.mkdir();
		System.out.println(res);
		if(!res) {
		boolean delCarpeta=fotos.delete();
		System.out.println("borrada la carpeta "+fotos.getName()+"? "+delCarpeta);
		}
	}

	public void mostrarFitxers(File f) {
		System.out.println(f.getAbsolutePath() + "es un fixer ? "+f.isFile());
		System.out.println(f.getAbsolutePath() + "es un directory ? "+f.isDirectory());
	}
}
