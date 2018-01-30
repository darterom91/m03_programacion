package ex_uf3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio6 prog = new Ejercicio6();
		prog.inicio();
	}

	public void inicio() {
		// TODO Auto-generated method stub
		String dir = System.getProperty("user.dir");
		File temp = new File(dir);
		File senars = new File(temp + "/senars.txt");
		File parells = new File(temp + "/parells.txt");
		PrintStream ps;
		PrintStream ps2;
		try {
			ps = new PrintStream(parells);
			ps2 = new PrintStream(senars);
			for (int i = 0; i <= 100; i++) {
				if (i % 2 == 0) {
					ps.print(i + " ");
				}
				if (i % 2 != 0) {
					ps2.print(i + " ");
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
