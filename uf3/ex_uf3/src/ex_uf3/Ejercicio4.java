package ex_uf3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dir = System.getProperty("user.dir");
		File temp = new File(dir);
		int valor = 0;
		String carpetas[] = temp.list();
		System.out.println("Introduce el valor que buscas: ");
		valor = introValor(valor);
		System.out.println(valor);
		mostrarCarpetas(temp, valor, carpetas);

	}

	public static void mostrarCarpetas(File temp, int valor, String[] carpetas) {
		// TODO Auto-generated method stub
		for (int i = 0; i < carpetas.length; i++) {
			File file = new File(temp + "/" + carpetas[i]);
			if (file.isFile()) {
				if (file.length() < valor) {
					System.out.println(file.getName() + " - " + file.length());
				}
			}
		}
	}

	private static int introValor(int valor) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int i = 0;

		while (i < 1) {
			if (s.hasNextInt()) {
				valor = s.nextInt();
				i = 1;
			} else {
				System.out.println("El valor no es entero");
				System.out.println("\nIntroduce el valor que buscas: ");
				s.next();
			}
		}
		return valor;
	}

}
