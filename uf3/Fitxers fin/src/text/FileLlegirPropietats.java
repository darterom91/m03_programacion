package text;

import java.io.File;
import java.util.Date;

public class FileLlegirPropietats {
	public static void main(String[] args) {
		FileLlegirPropietats programa = new FileLlegirPropietats();
		programa.inici();
	}

	public void inici() {
		File document = new File("prueba.txt");
		System.out.println(document.getAbsoluteFile());
		// S'usa el tipus composta Date per transformar mil·lisegons a data real
		Date data = new Date(document.lastModified());
		System.out.println("Darrera modificació: " + data);
		System.out.println("Mida: " + document.length());
	}
}
