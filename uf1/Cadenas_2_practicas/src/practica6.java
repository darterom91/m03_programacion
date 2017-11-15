import java.util.Scanner;

public class practica6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String frase = "";
		
		System.out.println("introduce una frase");
		frase=s.nextLine();
		
		String palabras[]=frase.split(" ");
		
		System.out.println("\n"+frase);
		System.out.println("La cantidad de palabras es: "+palabras.length);
	}
}
