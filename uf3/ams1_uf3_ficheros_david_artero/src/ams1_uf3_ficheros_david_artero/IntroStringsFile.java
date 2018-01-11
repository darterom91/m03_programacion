package ams1_uf3_ficheros_david_artero;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class IntroStringsFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fixer = new File("temp/Document2.txt");
		try {
			Scanner s = new Scanner(fixer);
			PrintStream write = new PrintStream(fixer);
			write=s.nextLine();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
