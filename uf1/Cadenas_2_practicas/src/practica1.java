import java.util.Scanner;

public class practica1 {
	public static void main(String []args){
		Scanner s = new Scanner(System.in);
		String frase;
		System.out.println("Escribe una frase: ");
		frase=s.nextLine();
		System.out.println("La frase ["+frase+"] tiene una longitud de: ");
		System.out.print(frase.length());
	}

}
