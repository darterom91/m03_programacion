package ams1_uf3_ficheros_david_artero;

import java.io.File;

public class prueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prueba1 prog = new prueba1();
		inicio();
	}

	public static void inicio() {
		// TODO Auto-generated method stub
		String Extension="jpg";
		String nomDir = System.getProperty("user.dir");
		File dir = new File(nomDir);
		System.out.println(dir.isDirectory());
		System.out.println(dir.getAbsolutePath());
	}

}
