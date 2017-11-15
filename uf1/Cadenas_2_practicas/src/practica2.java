import java.util.Scanner;

public class practica2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, cont = 0;
		Scanner s = new Scanner(System.in);
		String frase = "";
		String palabras[];
		String espacios[];
		int num[];
		
		System.out.println("Escribe una frase: ");
		frase = s.nextLine();
		System.out.println(frase);
		System.out.println("La longitud es de: " + frase.length());
		char letra[] = new char[frase.length()];

		System.out.println("Las letras son" + letra.length);
		for (i = 0; i < frase.length(); i++) {
			letra[i] = frase.charAt(i);
			System.out.println("[" + frase.charAt(i) + "]");
		}
		System.out.println();
		for (i = 0; i < letra.length; i++) {
			if (letra[i] == ' ') {
				cont++;
			}
		}

		
		System.out.println("El numero de palabras es: " + (cont+1));
		palabras = new String[cont];
		

	}
}
