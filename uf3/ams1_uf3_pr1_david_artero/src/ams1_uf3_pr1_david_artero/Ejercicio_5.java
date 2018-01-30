package ams1_uf3_pr1_david_artero;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio_5 prog = new Ejercicio_5();
		prog.inicio();
	}

	public void inicio() {
		// TODO Auto-generated method stub
		String nomDir = System.getProperty("user.dir");
		String comando[];
		Scanner s = new Scanner(System.in);
		File dir = new File(nomDir);
		try {

			do {
				System.out.print(dir.getAbsolutePath() + ":$ ");
				nomDir = s.nextLine();
				comando = nomDir.split(" ");
				nomDir = comando[1];
				if (comando[0].equals("cd") || comando[0].equals("dir")) {
					if (comando[0].equals("dir")) {
						walkin(dir);
					} else if (comando[1].equals("..")) {
						dir = new File(dir.getParent());
					} else {
						dir = new File(comando[1]);
					}
				} else {
					System.out.println("El comando introducido no existe");
				}

			} while (!nomDir.equals("fi"));

			System.out.println("Has salido...");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Algo ha fallado...");
		}
	}

	public static void walkin(File dir) {
		// TODO Auto-generated method stub
		File listFile[] = dir.listFiles();
		if (listFile != null) {
			for (int i = 0; i < listFile.length; i++) {
				if (listFile[i].isDirectory()) {
					Date data = new Date(listFile[i].lastModified());
					System.out.println("DIR "+listFile[i].getName() + " - tamaño: " + listFile[i].length() + " - data: " + data);
				} else {
					Date data = new Date(listFile[i].lastModified());
					System.out.println("FILE "+listFile[i].getName() + " - tamaño: " + listFile[i].length() + " - data: " + data);
				}
			}
		}
	}

}
